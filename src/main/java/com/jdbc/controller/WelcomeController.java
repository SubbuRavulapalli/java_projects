package com.jdbc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    private static final Logger logger = Logger.getLogger(WelcomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getWelcome() {

        //logs debug message
        if(logger.isDebugEnabled()){
            logger.debug("getWelcome is executed!");
        }

        //logs exception
        logger.error("This is Error message", new Exception("Testing"));

        ModelAndView model = new ModelAndView("welcome");
        model.addObject("msg", "Hello Spring MVC + Log4j");
        return model;

    }

    @RequestMapping("/login")
    public String login(){

        return "login";
    }
    @RequestMapping("/loginError")
    public String error(Model model){
        model.addAttribute("error","true");
        model.addAttribute("msg","Invalid Credentials\nPlease Try again");
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(Model model){
        model.addAttribute("error","true");
        model.addAttribute("msg","Logout sucessful");
//        String userName = CustomSucessHandler.getUserName();
//        serviceimpl.updateLogout(userName);
        return "login";
    }

    @RequestMapping("/signout")
    public void signOut(){}

}
