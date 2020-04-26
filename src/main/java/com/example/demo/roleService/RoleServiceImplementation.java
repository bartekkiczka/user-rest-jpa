package com.example.demo.roleService;

import com.example.demo.entity.Role;
import com.example.demo.exceptions.RoleNotFoundException;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImplementation implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImplementation(RoleRepository roleRepository){
        this.roleRepository = roleRepository;
    }


    @Override
    public Role findByRole(String role) {
        Optional<Role> result = roleRepository.findByRole(role);
        Role roleInstance = null;
        if(result.isPresent())
            roleInstance = result.get();
        else
            throw new RoleNotFoundException("Cant find role: " + role);
        return roleInstance;
    }

    @Override
    public Role findById(Long id) {
        Optional<Role> result = roleRepository.findById(id);
        Role role = null;
        if(result.isPresent())
            role = result.get();
        else
            throw new RuntimeException("Cant find role with id: " + id);
        return role;
    }
}
