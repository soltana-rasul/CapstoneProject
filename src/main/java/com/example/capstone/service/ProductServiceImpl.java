package com.example.capstone.service;

import com.example.capstone.model.Product;
import com.example.capstone.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() { return (List<Product>) productRepository.findAll();}
    @Override
    public Product getByProductId(Long productId) {return productRepository.findById(productId).get();}
    @Override
    public void saveOrUpdate(Product product) {productRepository.save(product);}
    @Override
    public void deleteProduct(Long productId) {productRepository.deleteById(productId);}

}