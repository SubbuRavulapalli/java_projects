package com.jdbc.service;

import com.jdbc.model.Admin;
import com.jdbc.model.Customer;

import java.util.List;

public interface AdminService {
    String addAdmin(Admin admin);
    List<Admin> fetchAllAdmins();
    Admin fetchById(int id);
}
