package com.jdbc.controller;

import com.jdbc.service.serviceimpl.CartServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
    @Autowired
    CartServiceimpl cartServiceimpl;

//    @RequestMapping("addToCart")
//    public String addCart()
}
