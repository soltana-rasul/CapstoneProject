package com.example.capstone.controller;

import com.example.capstone.model.Product;
import com.example.capstone.repository.ProdRepo;
import com.example.capstone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@AutoConfiguration
@RequestMapping(value= "/product")
public class AdminController {

    @Autowired
    ProductService productService;

    @PostMapping("/admin-create")
    public Product adminCreate(@RequestBody Product product) {
        productService.saveOrUpdate(product);
        return product;
    }
    @GetMapping("/listProduct")
    public List<Product> list() {
        return productService.getAllProduct();
    }
    @GetMapping("/list/{productId}")
    public Product getByProductId(@PathVariable Long productId){
        return productService.getByProductId(productId);
    }
    @DeleteMapping("/delete/{productId}")
    public String deleteProduct(@PathVariable(value="productId")Long productId){
        productService.deleteProduct(productId);
        return "Product " + productId +" Deleted Successfully.";
    }
}
