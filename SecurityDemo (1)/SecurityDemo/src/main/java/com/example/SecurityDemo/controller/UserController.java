package com.example.SecurityDemo.controller;

import com.example.SecurityDemo.entity.UserEnt;
import com.example.SecurityDemo.service.JwtService;
import com.example.SecurityDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public UserEnt register(@RequestBody UserEnt user){
        return userService.register(user);
    }
    @PostMapping("/validate/user")
    public String getToken(@RequestBody UserEnt user){
        Authentication authentication =authenticationManager.authenticate(new
                UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword()));
        if (authentication.isAuthenticated()) {

           return jwtService.generateToken(user.getUserName());
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
    }
    @GetMapping("/validate/token")
    public boolean validateToken(@RequestParam String token) {
        return userService.verifyToken(token);
    }

    @GetMapping("/sample")
    public  String sample(){
        return "Success";
    }




}
