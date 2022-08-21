package com.abdullah_aladham.kalemati.Security;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

//import lombok.Getter;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails {
	@Id
	@SequenceGenerator(name="user_generator",
	allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator = "user_generator")
	private Long id;
	private  String name;
	private String username;
	private String email;
	private String password;//user password :) 
	private ApplicationUserRole appUserRole ;// to give the user their role
	private Boolean Locked;//to check if the account is locked
	private Boolean enabled;//to check if the account is enabled
	
	public AppUser() {
		
	}
	public AppUser(String name, String username, String email, String password, ApplicationUserRole appUserRole,
			Boolean locked, Boolean enabled) {
	
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.appUserRole = appUserRole;
		Locked = locked;
		this.enabled = enabled;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		SimpleGrantedAuthority authority =
				new SimpleGrantedAuthority(appUserRole.name());//used for Storing a String representation of an authority granted to the Authentication object.
		return Collections.singletonList(authority);//returns the result of the authority object in an immuteable list
	}
	@Override
	public String getPassword() {
		// returns the password
		return password;
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return !Locked;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}
}
