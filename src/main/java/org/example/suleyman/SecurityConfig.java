package org.example.suleyman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.example.suleyman.service.CustomUserDetailsService;

@Configuration
public class SecurityConfig {

	@Autowired
	private CustomUserDetailsService customUserDetailsService;
	// Configuração do UserDetailsService


	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.authorizeRequests()
				.requestMatchers("/login", "/register", "/","/contact","about","api/*","image/*","image/category/*").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/login")
				.defaultSuccessUrl("/home", true)
				.failureUrl("/login?error=true")
				.permitAll()
				.and()
				.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login?logout")
				.permitAll();

		return http.build();
	}

	// Configuração do PasswordEncoder
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();  // Usando BCrypt para codificar senhas
	}
}
