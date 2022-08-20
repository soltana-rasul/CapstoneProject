package com.example.capstone.service;

import com.example.capstone.model.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();
    public User getById(Long id);
    public void saveOrUpdate(User user);
    public void deleteUser(Long id);


}
