package com.jdbc.dao.daoimpl;

import com.jdbc.dao.AddressDao;
import com.jdbc.model.Address;
import org.springframework.jdbc.core.JdbcTemplate;

public class AddressDaoimpl implements AddressDao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addAddress(Address address) {
        String query = "insert into address(userId,houseNo,street,village,city,pincode)values(?,?,?,?,?,?)";
        return jdbcTemplate.update(query,address.getUserId(),address.getHouseNo(),address.getStreet(),
                address.getVillage(),address.getCity(), address.getPincode());
    }
}
