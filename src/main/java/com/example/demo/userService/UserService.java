package com.example.demo.userService;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User findById(Long id);
    public void save(User user);
    public void deleteUserById(Long id);
}
