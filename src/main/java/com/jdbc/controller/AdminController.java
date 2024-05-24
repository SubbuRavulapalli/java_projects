package com.jdbc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jdbc.model.Admin;
import com.jdbc.service.serviceimpl.AdminServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminServiceimpl adminService;
    @RequestMapping("/adminForm")
    public String addRetailer( Model model ){
        model.addAttribute("admin",new Admin());
        return "adminInsert";
    }
    @RequestMapping(value = "/insertAdmin" ,method = RequestMethod.POST)
    public String save(@Valid @ModelAttribute("admin") Admin admin , Model model){
//        customerValidation.validate(customer,bindingResult);
//        if(bindingResult.hasErrors()){
//            return "customerInsert";
//        }
//        else{
        model.addAttribute("msg",adminService.addAdmin(admin));
        return "msg";
//        }
    }

    @RequestMapping(value = "/fetchAllAdmins",method = RequestMethod.GET)
    public String fetchAll(Model model){
        model.addAttribute("admins",adminService.fetchAllAdmins());
        return "allAdmins";
    }
    @RequestMapping("/getAdminHome")
    public String getAdminHome(){
        return "adminHome";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/one")
    @ResponseBody
    public String one(){
        return "Login Successfully";
    }

    @RequestMapping(value = "/sendAdminData")
    @ResponseBody
    public String postAdmin() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString(adminService.fetchAllAdmins());
        return data;
    }
    @RequestMapping("/sendAdminData/{id}")
    @ResponseBody
    public String postAdmin(@PathVariable("id")int id) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String data = mapper.writeValueAsString( adminService.fetchById(id));
        return data;
    }

    @RequestMapping(value = "/addAdmin",method = RequestMethod.POST)
    public String createAdmin(@RequestBody Admin admin){
        adminService.createAdmin(admin);
        return "added admin sucessful";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<Admin> fetchAll(){
        return adminService.getAll();
    }

}
