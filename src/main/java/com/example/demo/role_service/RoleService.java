package com.example.demo.role_service;

import com.example.demo.entity.Role;

public interface RoleService {

    public Role findByRole(String role);
    public Role findById(Long id);
}
