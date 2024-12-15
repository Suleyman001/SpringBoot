package org.example.suleyman.service;

import org.example.suleyman.dao.UserManager;
import org.example.suleyman.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserManager userManager;

	// Register user in the database
	public boolean registerUser(User user) {
		return userManager.addUser(user); // Calls UserManager to add user to the database
	}

	// Check if email exists in the database
	public boolean isEmailExists(String email) {
		return userManager.isEmailExists(email); // Calls UserManager to check if email exists
	}
}
