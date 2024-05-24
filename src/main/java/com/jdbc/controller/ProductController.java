package com.jdbc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdbc.model.*;
import com.jdbc.service.serviceimpl.AddressServiceimpl;
import com.jdbc.service.serviceimpl.CartServiceimpl;
import com.jdbc.service.serviceimpl.PaymentServiceimpl;
import com.jdbc.service.serviceimpl.ProductServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductServiceimpl productServiceimpl;
    @Autowired
    CartServiceimpl cartServiceimpl;
    @Autowired
    PaymentServiceimpl paymentServiceimpl;
    @Autowired
    AddressServiceimpl addressServiceimpl;


    @RequestMapping(value = "/getForm", method = RequestMethod.GET)
    public String getForm(Model model) {
        model.addAttribute("product", new Product());
        return "insertform";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("product") Product product, Model model) {

        model.addAttribute("msg", productServiceimpl.insertProduct(product));
        return "msg";
    }

//    @RequestMapping(value = "/fetchById", method = RequestMethod.GET)
//    public String fetchById(Model model) {
//        return "findById";
//    }

    @RequestMapping(value = "/fetchById" )
    public String fetchByIdpro(@RequestParam int productId, Model model){
        model.addAttribute("product",productServiceimpl.fetchById(productId));
        return "details";
    }
    @RequestMapping("/addTocart")
    public String cart(@ModelAttribute("cart") @RequestParam int productId,HttpServletRequest httpServletRequest, Model model){
        System.out.println("cart Page");
        HttpSession session = httpServletRequest.getSession();
        Product product = productServiceimpl.fetchById(productId);
        System.out.println(productId);
        if(product != null){
            cartServiceimpl.addToCart(product);
        }
        List<CartModel> cartList = cartServiceimpl.fetchAll();
        int totalPrice = 0;
        List<Product> products = new ArrayList<>();
        for(CartModel cart1 :cartList){
            int id = cart1.getProductId();
            System.out.println(id);
             Product product1 = productServiceimpl.fetchById(id);
            System.out.println(product1);
             totalPrice+=product1.getPrice();
             products.add(product1);
        }
        model.addAttribute("add",products);
        model.addAttribute("total",totalPrice);
        session.setAttribute("total",totalPrice);
        session.setAttribute("products",products);
        return "cart";
    }
    @RequestMapping("/cartPage")
    public String cart( Model model){
        List<CartModel> cartList = cartServiceimpl.fetchAll();
        List<String> names = new ArrayList<>();
        int totalPrice = 0;
        List<Product> products = new ArrayList<>();
        for(CartModel cart1 :cartList){
            int id = cart1.getProductId();
            Product product1 = productServiceimpl.fetchById(id);
            totalPrice+=product1.getPrice();
            names.add(product1.getProductName());
            products.add(product1);
        }
        model.addAttribute("add",products);
        model.addAttribute("total",totalPrice);
        return "cart";
    }
    @RequestMapping("/remove")
    public String removeCart(@RequestParam int productId, Model model){
        cartServiceimpl.remove(productId);
        List<CartModel> cartList = cartServiceimpl.fetchAll();
        int totalPrice = 0;
        List<Product> products = new ArrayList<>();
        for(CartModel cart1 :cartList){
            int id = cart1.getProductId();
            Product product1 = productServiceimpl.fetchById(id);
            totalPrice+=product1.getPrice();
            products.add(product1);
        }
        model.addAttribute("add",products);
        model.addAttribute("total",totalPrice);
        return "cart";
    }

    @RequestMapping("addToPayment")
    public String payment(@ModelAttribute("address")Address address, HttpServletRequest httpServletRequest, Model model){
//        model.addAttribute("product",productServiceimpl.fetchById(productId));
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("address",address);

        addressServiceimpl.addAddress(address);
        model.addAttribute("payment",new Payment());
        return "payment";
    }
    @RequestMapping("/order")
    public String order(@ModelAttribute("address") Address address, HttpServletRequest httpServletRequest, Model model, Authentication authentication){
        User principal= (User) authentication.getPrincipal();
        String name  = principal.getUsername();
        addressServiceimpl.addAddress(address);
        model.addAttribute("msg","Your Order Successfully Placed...");
        model.addAttribute("data",httpServletRequest.getSession().getAttribute("total"));
        model.addAttribute("name",name);
        List<Product> list = (List<Product>) httpServletRequest.getSession().getAttribute("products");
        for(Product l : list){
            System.out.println(l.getProductName());
        }
        model.addAttribute("products",list);
        return "orderConform";
    }
    @RequestMapping(value = "/getAddress", method = RequestMethod.GET)
    public String getAdd( Model model){
//        model.addAttribute("product",productServiceimpl.fetchById(productId));
        model.addAttribute("address",new Address());
        return "address";
    }



    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public String deleteById(Model model) {
        return "deleteById";
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.GET)
    public String updateById(Model model) {
        return "updateById";
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String find(@RequestParam int productId, Model model) {
        model.addAttribute("product", productServiceimpl.fetchById(productId));
        return "product";
    }

    @RequestMapping(value = "/fetchAll", method = RequestMethod.GET)
    public String fetchAll(Model model) {
        model.addAttribute("products", productServiceimpl.fetchAllproducts());
        return "allProducts";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deletePoduct(@RequestParam int productId, Model model) {
        model.addAttribute("msg", productServiceimpl.deleteproduct(productId));
        return "msg";
    }

    @RequestMapping("/updateForm")
    public String updateform(@RequestParam int productId, Model model) {
        Product product = productServiceimpl.fetchById(productId);
        model.addAttribute("data", product);
        return "updateForm";
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public String updateProduct(Product product, Model model) {
        model.addAttribute("msg", productServiceimpl.updateProduct(product));
        return "msg";
    }

    @RequestMapping("/postApi")
    @ResponseBody
    public String sendApi() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String data = objectMapper.writeValueAsString(productServiceimpl.fetchAllproducts());
        return data;
    }

    @RequestMapping("/postApiById/{id}")
    @ResponseBody
    public String sendById(@PathVariable("id") int id) throws JsonProcessingException {
        System.out.println(id);
        ObjectMapper objectMapper = new ObjectMapper();
        String data = objectMapper.writeValueAsString(productServiceimpl.fetchById(id));
        System.out.println(data);
        return data;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String addProduct(@RequestBody Product product) {
         String msg = productServiceimpl.insertProduct(product);
        return msg;
    }

    @RequestMapping("/viewAll")
    public String view(Model model){
        List<Product> products = productServiceimpl.fetchAllproducts();
        model.addAttribute("products",products);
        return "viewProducts";
    }

}
