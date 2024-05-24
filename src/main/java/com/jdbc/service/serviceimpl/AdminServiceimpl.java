package com.jdbc.service.serviceimpl;

import com.jdbc.dao.daoimpl.AdminDaoimpl;
import com.jdbc.model.Admin;
import com.jdbc.service.AdminService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class AdminServiceimpl implements AdminService {
    AdminDaoimpl  adminDaoimpl;

    RestTemplate restTemplate;

    public RestTemplate getRestTemplate() {
        return restTemplate;
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public AdminDaoimpl getAdminDaoimpl() {
        return adminDaoimpl;
    }

    public void setAdminDaoimpl(AdminDaoimpl adminDaoimpl) {
        this.adminDaoimpl = adminDaoimpl;
    }

    @Override
    public String addAdmin(Admin admin) {
        try {
            admin.setRole("ROLE_ADMIN");
            admin.setPassword(encryptPassword(admin.getPassword()));
          adminDaoimpl.addAdmin(admin);
            return "Admin added Sucessfulllyyy....";
        }
        catch (Exception e){
            return "something went wrong";
        }
    }

    public Admin createAdmin(Admin admin) {
        String url = "http://localhost:8080/updateAdmin";
        HttpEntity<Admin> adminreq = new HttpEntity<>(admin);
        ResponseEntity<Admin> response = restTemplate.postForEntity(url,adminreq, Admin.class);
        return response.getBody();
    }
    public List<Admin> getAll() {
        String url = "http://localhost:8080/getAllAdmins";
        ResponseEntity<Admin[]> response = restTemplate.getForEntity(url,Admin[].class);
        return Arrays.asList(response.getBody());
    }
    @Override
    public List<Admin> fetchAllAdmins() {
        return adminDaoimpl.fetchAllAdmin();
    }

    @Override
    public Admin fetchById(int id) {
        return adminDaoimpl.fetchByid(id);
    }
    private String encryptPassword(String planePassword) {
        System.out.println(planePassword);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(planePassword);
        System.out.println("encryped password is--------"+hashedPassword);
        return hashedPassword;
    }

}
