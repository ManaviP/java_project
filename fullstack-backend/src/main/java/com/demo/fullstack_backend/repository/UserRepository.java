package com.demo.fullstack_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.fullstack_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContainingIgnoreCase(String product);
    List<User> findByEmailContainingIgnoreCase(String quantity);
}
