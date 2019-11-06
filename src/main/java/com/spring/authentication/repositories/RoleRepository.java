package com.spring.authentication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.authentication.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
