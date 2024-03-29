package com.abdullah_aladham.kalemati.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig  {
	private final PasswordEncoder passwordEncoder;
	@Autowired
	public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder=passwordEncoder;
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.authorizeRequests()
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic();
	}

	
	@Bean
	protected UserDetailsService userDetailsService() {
		
		// TODO Auto-generated method stub
	UserDetails TestUser =User.builder()
	.username("Test")
	.password(passwordEncoder.encode("password"))
	.roles("CUSTOMER")
	.build();
	
	UserDetails Admin_Abdullah =User.builder()
	.username("Abdullah Aladham")
	.password(passwordEncoder.encode("password"))
	.roles("ADMIN")
	.build();
	return new InMemoryUserDetailsManager(
			TestUser,
			Admin_Abdullah
			);
	
	}

	
}
