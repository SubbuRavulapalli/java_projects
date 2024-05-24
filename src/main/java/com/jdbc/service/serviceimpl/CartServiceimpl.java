package com.jdbc.service.serviceimpl;

import com.jdbc.dao.daoimpl.CartDaoimpl;
import com.jdbc.model.CartModel;
import com.jdbc.model.Product;
import com.jdbc.service.CartService;

import java.util.List;

public class CartServiceimpl implements CartService {
    CartDaoimpl cartDaoimpl;

    public CartDaoimpl getCartDaoimpl() {
        return cartDaoimpl;
    }

    public void setCartDaoimpl(CartDaoimpl cartDaoimpl) {
        this.cartDaoimpl = cartDaoimpl;
    }

    @Override
    public String addToCart( Product product) {
        try{
            CartModel cart = new CartModel();
            cart.setProductId(product.getProductId());
            cart.setProductName(product.getProductName());
            cartDaoimpl.addToCart(cart);
            System.out.println("inserted...");
            return "inserted....";
        }
        catch (Exception e){
            return "something wrong";
        }
    }

    @Override
    public List<CartModel> fetchAll() {
        return cartDaoimpl.fetchAll();
    }

    @Override
    public String remove(int productId) {
        cartDaoimpl.remove(productId);
        System.out.println("remove from cart...");
        return"deleted";
    }
}
