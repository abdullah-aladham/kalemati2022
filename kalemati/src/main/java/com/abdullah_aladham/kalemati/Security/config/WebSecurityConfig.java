package com.abdullah_aladham.kalemati.Security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.abdullah_aladham.kalemati.Services.AppUserService;

import lombok.AllArgsConstructor;
@Configuration
@AllArgsConstructor
@EnableWebSecurity
public class WebSecurityConfig  {
	
	private final AppUserService appUserService;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	


	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http
           .authorizeHttpRequests((authz) -> authz
                .anyRequest().authenticated()
            )
            .httpBasic();
        return http.build();
       
    }
	protected void configure(HttpSecurity Http) throws Exception{
		 Http
     	.csrf().disable()
     	.authorizeRequests()
     		.antMatchers("/Kalemati/Register*/NewUser/**")
     		.permitAll()
     		.anyRequest()
     		.authenticated().and()
     		.formLogin();
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.authenticationProvider(daoAuthenticationProvider());
	}
	@Bean
	public DaoAuthenticationProvider daoAuthenticationProvider() {
		
		DaoAuthenticationProvider provider = 
				new DaoAuthenticationProvider();
		provider.setPasswordEncoder( bCryptPasswordEncoder);
		provider.setUserDetailsService(appUserService);
		return provider;
	}
}
