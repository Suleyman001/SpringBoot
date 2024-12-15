package org.example.suleyman.service;

import org.example.suleyman.dao.UserManager;
import org.example.suleyman.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserManager userManager;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


		User user = userManager.getUserByEmail(username);
		if (user == null) {
			System.out.println("DEBUG: Usuário não encontrado para o email: " + username);
			throw new UsernameNotFoundException("User not found");
		}

		System.out.println("DEBUG: user login - Email: " + user.getEmail() + ", Role: " + user.getRole());

		UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(user.getEmail());
		builder.password(user.getPassword());
		builder.roles(user.getRole());

		return builder.build();
	}
}
