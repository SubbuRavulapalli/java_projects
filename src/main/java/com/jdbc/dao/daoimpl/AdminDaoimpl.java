package com.jdbc.dao.daoimpl;

import com.jdbc.dao.AdminDao;
import com.jdbc.model.Admin;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class AdminDaoimpl implements AdminDao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAdmin(Admin admin) {
        String query = "insert into customer(id,userName,role,password,phone,email)values(?,?,?,?,?,?)";
        System.out.println("admin dao"+admin.getPassword()+"\n"+admin.getRole());
        return jdbcTemplate.update(query,admin.getId(),admin.getName(),admin.getRole(),admin.getPassword(),admin.getPhone(),admin.getEmail());
    }

    @Override
    public List<Admin> fetchAllAdmin() {
        String query = "select * from admin";
        return jdbcTemplate.query(query, new RowMapper<Admin>() {
            @Override
            public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
                Admin admin = new Admin();
                admin.setId(rs.getInt(1));
                admin.setName(rs.getString(2));
                admin.setPassword(rs.getString(3));
                admin.setRole(rs.getString(4));
                admin.setEmail(rs.getString(6));
                admin.setPhone(rs.getLong(5));
                return admin;
            }
        });
    }

    @Override
    public Admin fetchByid(int id) {
        String query = "select * from admin where id = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{id},new BeanPropertyRowMapper<Admin>(Admin.class));
    }
}
