package com.example.SecurityDemo.repo;

import com.example.SecurityDemo.entity.UserEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserEnt,Integer> {
    Optional<UserEnt> findByUserName(String username);
}
