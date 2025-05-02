package com.ecmart.product_service.service;

import com.ecmart.product_service.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    Product getProductByName(String name);
    void updateProduct(Product product);
    void deleteProduct(long id);
    List<Product> getAllProducts();
}
