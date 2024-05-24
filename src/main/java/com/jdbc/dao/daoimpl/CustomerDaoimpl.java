package com.jdbc.dao.daoimpl;

import com.jdbc.dao.CustromerDao;
import com.jdbc.model.Customer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CustomerDaoimpl implements CustromerDao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addCustomer(Customer customer) {
        String query = "insert into customer(id,userName,role,password,phone,email)values(?,?,?,?,?,?)";
        System.out.println("customer dao"+customer.getPassword()+"\n"+customer.getRole());
        return jdbcTemplate.update(query,customer.getId(),customer.getName(),customer.getRole(),customer.getPassword(),customer.getPhone(),customer.getEmail());
    }

    @Override
    public List<Customer> fetchAllCustomers() {
        String query = "select * from customer";
       return jdbcTemplate.query(query, new RowMapper<Customer>() {
           @Override
           public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
               Customer customer = new Customer();
               customer.setId(rs.getInt(1));
               customer.setName(rs.getString(2));
               customer.setPassword(rs.getString(3));
               customer.setRole(rs.getString(4));
               customer.setEmail(rs.getString(6));
               customer.setPhone(rs.getLong(5));
               return customer;
           }
       });
    }

    @Override
    public Customer fetchByid(int id) {
        String query = "select * from customer where id = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{id},new BeanPropertyRowMapper<Customer>(Customer.class));
    }

}
