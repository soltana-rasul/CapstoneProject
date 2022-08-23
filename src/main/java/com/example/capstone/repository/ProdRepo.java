package com.example.capstone.repository;

import com.example.capstone.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProdRepo extends CrudRepository<Product, String> {
}
