package com.example.taskmanagement.system.service;

import com.example.taskmanagement.system.entity.User;
import com.example.taskmanagement.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUser(){
        return userRepository.findAll();

    }
    public Optional<User> getUserById(Long theId){
        return userRepository.findById(theId);
    }
    public User createUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long theId){
        userRepository.deleteById(theId);
    }
}
