package com.example.SecurityDemo.service;

import com.example.SecurityDemo.entity.UserEnt;
import com.example.SecurityDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    public JwtService jwtService;

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public UserEnt register(UserEnt user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepo.saveAndFlush(user);

    }
    public boolean verifyToken(String token) {
        jwtService.validateToken(token);
        return true;
    }



}
