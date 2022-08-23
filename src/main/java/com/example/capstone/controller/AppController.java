package com.example.capstone.controller;

import com.example.capstone.model.Product;
import com.example.capstone.model.User;
import com.example.capstone.repository.ProdRepo;
import com.example.capstone.service.ProductService;
import com.example.capstone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@AutoConfiguration
@RequestMapping(value= "/apis")
public class AppController {

    @Autowired
    UserService userService;

    @Autowired
    ProdRepo prodRepo;

    @ResponseBody
    @GetMapping("/user/view-catalog")
    public List<Product> getAll() {
        Spliterator<Product> products = prodRepo.findAll().spliterator();
        return StreamSupport.stream(products, false).collect(Collectors.toList());
    }

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @PostMapping("/register")
    public User register(@RequestBody User user){
        userService.saveOrUpdate(user);
        return user;
    }
    @PostMapping("/login")
    public String loginPage(){
        return "login successful";
    }
    @GetMapping("/list")
        public List<User> list() {
        return userService.getAllUser();
    }
    @GetMapping("/list/{id}")
        public User getById(@PathVariable Long id){
        return userService.getById(id);
    }
    @DeleteMapping("/delete/{id}")
        public String deleteUser(@PathVariable(value="id")Long id){
        userService.deleteUser(id);
        return "User " + id +" Deleted Successfully.";
    }

}
