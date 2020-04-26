package com.example.demo.userService;

import com.example.demo.entity.User;
import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> result = userRepository.findById(id);
        User user = null;
        if(result.isPresent())
            user = result.get();
        else
            throw new UserNotFoundException("Cant find user with id: " + id);
        return user;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
