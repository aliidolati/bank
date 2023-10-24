package com.example.bank.repository;

import com.example.bank.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , String> {
    public User findUserByEmail(String email) ;
}
