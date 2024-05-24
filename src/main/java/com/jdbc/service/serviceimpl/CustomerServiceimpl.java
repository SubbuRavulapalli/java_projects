package com.jdbc.service.serviceimpl;

import com.jdbc.dao.CustromerDao;
import com.jdbc.dao.daoimpl.CustomerDaoimpl;
import com.jdbc.model.Customer;
import com.jdbc.service.CustromerService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class CustomerServiceimpl implements CustromerService {
   CustomerDaoimpl customerDaoimpl;

    public CustomerDaoimpl getCustomerDaoimpl() {
        return customerDaoimpl;
    }

    public void setCustomerDaoimpl(CustomerDaoimpl customerDaoimpl) {
        this.customerDaoimpl = customerDaoimpl;
    }

    @Override
    public String addCustromer(Customer customer) {
        try{
            customer.setRole("ROLE_USER");
            customer.setPassword(encryptPassword(customer.getPassword()));
            customerDaoimpl.addCustomer(customer);
            return "Admin added Sucessfulllyyy....";
        }
       catch (Exception e){
           return "something went wrong";
       }
    }

    @Override
    public List<Customer> fetchAllCustorems() {
        return customerDaoimpl.fetchAllCustomers();
    }

    @Override
    public Customer fetchById(int id) {
        return customerDaoimpl.fetchByid(id);
    }
    private String encryptPassword(String planePassword) {
        System.out.println(planePassword);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(planePassword);
        System.out.println("encryped password is--------"+hashedPassword);
        return hashedPassword;
    }

}
