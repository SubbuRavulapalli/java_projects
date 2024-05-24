package com.jdbc.dao.daoimpl;

import com.jdbc.dao.Productdao;
import com.jdbc.model.Admin;
import com.jdbc.model.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDaoimpl implements Productdao {
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertProduct(Product product) {
        String query = "insert into product(productId,productName,productBrand,gender,color,price,description,image)values (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(query,product.getProductId(),product.getProductName(),product.getProductBrand(),product.getGender(),
                product.getColor(),product.getPrice(),product.getDescription(),product.getImage());
    }

    @Override
    public Product fetchById(int productId) {
        String query = "select * from product where productId = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{productId},new BeanPropertyRowMapper<Product>(Product.class));
    }

    @Override
    public List<Product> fetchAllProducts() {
        String query = "select * from product";
        return jdbcTemplate.query(query, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                Product product = new Product();
                product.setProductId(rs.getInt(1));
                product.setProductName(rs.getString(2));
                product.setProductBrand(rs.getString("productBrand"));
                product.setGender(rs.getString("gender"));
                product.setColor(rs.getString("color"));
                product.setPrice(rs.getDouble("price"));
                product.setDescription(rs.getString("description"));
                product.setImage(rs.getString("image"));
                return product;
            }
        });
    }

    @Override
    public int deleteProduct(int productId) {
        String query = "delete from product where productId = ?";
        return getJdbcTemplate().update(query, productId);
    }

    @Override
    public int updateProduct(Product product) {
        String query = "update product set productName =?,productBrand = ?,gender = ?,color = ?,price =?,description = ? where productId =?";
        return jdbcTemplate.update(query, product.getProductName(),product.getProductBrand(),product.getGender(),product.getColor(),product.getPrice(),product.getDescription(),product.getProductId());

    }


}
