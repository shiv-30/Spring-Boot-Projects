package com.example.demo_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_1.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
