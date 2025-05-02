package com.ecmart.product_service.service;

import com.ecmart.product_service.repository.ProductRepository;
import org.springframework.stereotype.Service;
import com.ecmart.product_service.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product getProductByName(String name) {
        return productRepository.findByName(name);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
