package com.jdbc.controller;

import com.jdbc.model.Customer;
import com.jdbc.model.Product;
import com.jdbc.service.CustromerService;
import com.jdbc.validation.CustomerValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    CustromerService custromerService;

    @Autowired
    CustomerValidation customerValidation;

    @RequestMapping("/cutomerForm")
    public String addCustomer( Model model ){
        model.addAttribute("customer",new Customer());
        return "customerInsert";
    }
    @RequestMapping(value = "/insert" ,method = RequestMethod.POST)
    public String save(@Valid  @ModelAttribute("customer") Customer customer, Model model, BindingResult bindingResult){
        customerValidation.validate(customer,bindingResult);
        if(bindingResult.hasErrors()){
            return "customerInsert";
        }
        else{
            model.addAttribute("msg",custromerService.addCustromer(customer));
            return "msg";
        }
    }
    @RequestMapping("/customerspage")
    public String customer(){
        return "customerspage";
    }
    @RequestMapping("/productspage")
    public  String product(){
        return "productspage";
    }

    @RequestMapping(value = "/fetchAllCustomers",method = RequestMethod.GET)
    public String fetchAll(Model model){
        model.addAttribute("customers",custromerService.fetchAllCustorems());
        return "allCustomers";
    }
    @RequestMapping("customerFetchbyId")
    public String fetchById(@RequestParam int id,Model model){
        model.addAttribute("customer",custromerService.fetchById(id));
        return "customer";
    }
    @RequestMapping("fetchByIdForm")
    public String fetchByIdForm(){
        return "findByIdCustomer";
    }

    @RequestMapping("/getUserHome")
    public String getuserHome(){
        return "customerHome";
    }
    @RequestMapping("/userProducts")
    public String pro(){
        return "viewProducts";
    }

}
