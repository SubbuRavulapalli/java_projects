package com.jdbc.handler;

import com.jdbc.service.serviceimpl.CustomerServiceimpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.ui.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

public class CustomSucessHandler implements AuthenticationSuccessHandler {
    CustomerServiceimpl customerServiceimpl;

    RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    static String userName;



    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        System.out.println("before sucess handler....");
        if(authentication.isAuthenticated()){
            User principal = (User) authentication.getPrincipal();
            userName = principal.getUsername();
            System.out.println("Username is  "+userName);

        }
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for(GrantedAuthority grantedAuthority : authorities){
            if(grantedAuthority.getAuthority().equals("ROLE_ADMIN")){
                redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"/productspage");
            } else if (grantedAuthority.getAuthority().equals("ROLE_USER")) {
                redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"/customerspage");
            }
            else{
                redirectStrategy.sendRedirect(httpServletRequest,httpServletResponse,"redirect/:index");
            }
        }
    }
    public CustomerServiceimpl getCustomerServiceimpl() {
        return customerServiceimpl;
    }

    public void setCustomerServiceimpl(CustomerServiceimpl customerServiceimpl) {
        this.customerServiceimpl = customerServiceimpl;
    }

}
