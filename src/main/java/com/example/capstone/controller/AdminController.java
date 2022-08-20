package com.example.capstone.controller;

import com.example.capstone.model.Product;
import com.example.capstone.model.User;
import com.example.capstone.repository.ProdRepo;
import com.example.capstone.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AutoConfiguration
@RequestMapping(value= "/apip")
public class AdminController {

    @Autowired
    ProdRepo prodRepo;

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
