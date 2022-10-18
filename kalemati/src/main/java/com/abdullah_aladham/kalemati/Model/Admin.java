package com.abdullah_aladham.kalemati.Model;

import com.abdullah_aladham.kalemati.Security.ApplicationUserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long Id;
	@Column(nullable=false )
	private String Name;
	@Column(nullable=false)
	private String Phone;
	@Column(nullable=false)
	private ApplicationUserRole role;

	public Admin(Long id, String name, String phone, ApplicationUserRole role) {
		Id = id;
		Name = name;
		Phone = phone;
		this.role = role;
	}
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public ApplicationUserRole getRole() {
		return role;
	}
	public void setRole(ApplicationUserRole role) {
		this.role = role;
	}

}
