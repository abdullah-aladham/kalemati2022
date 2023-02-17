package com.abdullah_aladham.kalemati.Model;

import java.util.Collection;
import java.util.Collections;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.abdullah_aladham.kalemati.Security.ApplicationUserRole;

import jakarta.persistence.*;
//import lombok.Getter;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
public class AppUser implements UserDetails {
	@Id
	@SequenceGenerator(name="user_generator",
	allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator = "user_generator")
	private Long id;
	private  String firstname;
	private String lastName;
	private String email;
	private String password;//user password :)
	//@Column
	private boolean locked=false;
	private boolean enabled=false;

	@Enumerated(EnumType.STRING)
	private ApplicationUserRole appUserRole ;// to give the user their role
	
	
	public AppUser() {
		
	}
	public AppUser(String firstname, String lastName, String email, String password, ApplicationUserRole appUserRole) {
	
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.appUserRole = appUserRole;
		this.locked=locked;
		this.enabled=enabled;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		SimpleGrantedAuthority authority =
				new SimpleGrantedAuthority(appUserRole.name());//used for Storing a String representation of an authority granted to the Authentication object.
		return Collections.singletonList(authority);//returns the result of the authority object in an immuteable list
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	@Override
	public String getPassword() {
		// returns the password
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getlastName() {
		// TODO Auto-generated method stub
		return lastName;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return email;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public ApplicationUserRole getAppUserRole() {
		return appUserRole;
	}

	public void setAppUserRole(ApplicationUserRole appUserRole) {
		this.appUserRole = appUserRole;
	}
}
