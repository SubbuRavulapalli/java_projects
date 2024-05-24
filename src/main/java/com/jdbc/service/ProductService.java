package com.jdbc.service;

import com.jdbc.model.Product;

import java.util.List;

public interface ProductService {
    String insertProduct(Product product);

    Product fetchById(int productId);
    List<Product> fetchAllproducts();

    String deleteproduct(int productId);

    String updateProduct(Product product);
}
