package com.abdullah_aladham.kalemati.Model;

import com.abdullah_aladham.Kalemati21.Security.ApplicationUserRole;

public class Admin {
	private Long Id;
	private String Name;
	private String Phone;
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
