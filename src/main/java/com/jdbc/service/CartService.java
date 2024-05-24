package com.jdbc.service;

import com.jdbc.model.CartModel;
import com.jdbc.model.Product;

import java.util.List;

public interface CartService {
    String addToCart( Product product);
    List<CartModel> fetchAll();
    String remove(int productId);
}
