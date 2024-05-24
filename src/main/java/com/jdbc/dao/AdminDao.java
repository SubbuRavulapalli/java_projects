package com.jdbc.dao;

import com.jdbc.model.Admin;
import java.util.List;

public interface AdminDao {
    int addAdmin(Admin admin);
    List<Admin> fetchAllAdmin();
    Admin fetchByid(int id);
}
