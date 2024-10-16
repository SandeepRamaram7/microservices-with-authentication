package com.example.SecurityDemo.service;

import com.example.SecurityDemo.entity.UserEnt;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserInfoUserDetails  implements UserDetails {
    private String name;
    private String password;
    public UserInfoUserDetails(UserEnt user) {
        this.name=user.getUserName();
        this.password=user.getPassword();


    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }



    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }
}
