package com.abdullah_aladham.kalemati.Security.RegConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class RegSecConfig {
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// TODO Auto-generated method stub
//		http
//				.csrf().disable()
//				.authorizeRequests()
//					.antMatchers("/api/v*/registration/**")
//					.permitAll()
//					.anyRequest()
//					.authenticated().and()
//					.formLogin();
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		// TODO Auto-generated method stub
//			auth.authenticationProvider(null);
//
//	}
//	
////	@Bean 
////	public DaoAuthenticationProvider daoAuthenticationProvider() {
////		DaoAuthenticationProvider provider =
////				new DaoAuthenticationProvider();
////		provider.setPasswordEncoder();
////		provider.setUserDetailsService();
////		return provider;
////	}//here we stopped working on security side of user register 
//	

}
