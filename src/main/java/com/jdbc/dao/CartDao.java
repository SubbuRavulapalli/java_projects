package com.jdbc.dao;

import com.jdbc.model.CartModel;

import java.util.List;

public interface CartDao {
    int addToCart(CartModel cart);
    List<CartModel> fetchAll();
    int remove(int productId);

}
