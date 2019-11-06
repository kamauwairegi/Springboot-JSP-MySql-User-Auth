package com.spring.authentication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.authentication.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
