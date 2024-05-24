package com.jdbc.model;

public class Orders {
    private int orderId;
    private String userName;
    private String productName;
    private double price;
    private String paymentMode;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", paymentMode='" + paymentMode + '\'' +
                '}';
    }
}
