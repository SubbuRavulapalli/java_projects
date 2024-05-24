package com.jdbc.dao.daoimpl;

import com.jdbc.dao.CartDao;
import com.jdbc.model.CartModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CartDaoimpl implements CartDao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addToCart(CartModel cart) {
        String query = "insert into cart(productId,productName)values(?,?)";
       return  jdbcTemplate.update(query,cart.getProductId(),cart.getProductName());
    }


    @Override
    public List<CartModel> fetchAll() {
        String query = "select * from cart";
        return jdbcTemplate.query(query, new RowMapper<CartModel>() {
            @Override
            public CartModel mapRow(ResultSet rs, int rowNum) throws SQLException {
                CartModel cart = new CartModel();
                cart.setProductId(rs.getInt("productId"));
                cart.setProductName(rs.getString("productname"));
                return cart;
            }
        });
    }

    @Override
    public int remove(int productId) {
        String query = "delete from cart where productId = ?";
        return jdbcTemplate.update(query,productId);
    }
}
