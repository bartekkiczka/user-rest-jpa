package com.example.demo.role_service;

import com.example.demo.entity.Role;
import com.example.demo.exceptions.RoleNotFoundException;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public Role findByRole(String role) {
        Optional<Role> result = roleRepository.findByRole(role);
        Role roleInstance = null;
        if (result.isPresent())
            roleInstance = result.get();
        else
            throw new RoleNotFoundException("Cant find role: " + role);
        return roleInstance;
    }

    public Role findById(Long id) {
        Optional<Role> result = roleRepository.findById(id);
        Role role = null;
        if (result.isPresent())
            role = result.get();
        else
            throw new RuntimeException("Cant find role with id: " + id);
        return role;
    }
}
