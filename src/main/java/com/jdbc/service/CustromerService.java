package com.jdbc.service;

import com.jdbc.model.Customer;

import java.util.List;

public interface CustromerService {
    String addCustromer(Customer customer);
    List<Customer> fetchAllCustorems();
    Customer fetchById(int id);
}
