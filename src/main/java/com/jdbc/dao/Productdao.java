package com.jdbc.dao;

import com.jdbc.model.Product;

import java.util.List;

public interface Productdao {

    int insertProduct(Product product);

    Product fetchById(int productId);

    List<Product> fetchAllProducts();
    int deleteProduct(int productId);

    int updateProduct(Product product);

}
