package com.jdbc.dao;

import com.jdbc.model.Customer;

import java.util.List;

public interface CustromerDao {
    int addCustomer(Customer customer);
    List<Customer> fetchAllCustomers();
    Customer fetchByid(int id);
}
