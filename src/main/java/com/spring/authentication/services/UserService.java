package com.spring.authentication.services;

import com.spring.authentication.models.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
