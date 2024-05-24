package com.jdbc.service.serviceimpl;

import com.jdbc.dao.daoimpl.ProductDaoimpl;
import com.jdbc.model.Product;
import com.jdbc.service.ProductService;

import java.util.List;

public class ProductServiceimpl implements ProductService {

     ProductDaoimpl productDaoimpl;

    public ProductDaoimpl getProductDaoimpl() {
        return productDaoimpl;
    }

    public void setProductDaoimpl(ProductDaoimpl productDaoimpl) {
        this.productDaoimpl = productDaoimpl;
    }

    @Override
    public String insertProduct(Product product) {
         if(productDaoimpl.insertProduct(product)>0){
             return "Product Inserted Sucessfullyyy";
         }
         else
             return " product  Not Inserted....";
    }

    @Override
    public Product fetchById(int productId) {
        if(productDaoimpl!= null){
            return productDaoimpl.fetchById(productId);
        }
        else
            return null;
    }

    @Override
    public List<Product> fetchAllproducts() {
        List<Product> products = productDaoimpl.fetchAllProducts();
        if(products.isEmpty())
            return null;
        else
            return products;
    }

    @Override
    public String deleteproduct(int productId) {
        if(productDaoimpl.deleteProduct(productId) >0){
            return "Product Deleted sucessfully....";
        }
        else
            return "something went worng";
    }

    @Override
    public String updateProduct(Product product) {
//        if(productDaoimpl.updateProduct(product) >0){
//            return "Product Updated Sucessfully";
//        }
//        else
//            return "something Went wrong";
        try {
            productDaoimpl.updateProduct(product);
            return "Product Updated Sucessfully";
        }
        catch (Exception e){
            return "something went worng";
        }
    }
}
