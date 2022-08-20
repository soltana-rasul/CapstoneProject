package com.example.capstone.repository;

import com.example.capstone.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Map;

public interface ProductRepository extends CrudRepository<Product, Long> {
    }
