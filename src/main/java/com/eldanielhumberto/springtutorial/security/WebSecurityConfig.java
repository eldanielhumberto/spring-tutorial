package com.eldanielhumberto.springtutorial.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.eldanielhumberto.springtutorial.utils.JwtUtil;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
				.csrf(csrf -> csrf.disable())
				.sessionManagement(
						sessionManagement -> sessionManagement
								.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests(
						authorize -> authorize.requestMatchers("/api/auth/login", "/api/operations").permitAll()
								.anyRequest().authenticated())
				.addFilterAfter(new JwtAuthorizationFilter(new JwtUtil()),
						UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
}
