package com.example.capstone.service;

import com.example.capstone.model.Product;
import com.example.capstone.model.User;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getByProductId(Long productId);
    public void saveOrUpdate(Product product);
    public void deleteProduct(Long productId);
}
