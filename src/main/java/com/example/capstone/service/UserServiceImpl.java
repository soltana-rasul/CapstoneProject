package com.example.capstone.service;

import com.example.capstone.model.User;
import com.example.capstone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }
    @Override
    public void saveOrUpdate(User user) {
        userRepository.save(user);
    }
    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}
