package com.abdullah_aladham.kalemati.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Account_manager {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long Id;
	@Column(nullable=false)
	protected String name;
	@Column(nullable=false)
	protected String Code;
	@Column(nullable=false)
	private boolean isdeleted;
	@ManyToOne
	private List<Teacher> teachers;
	@OneToOne
	private School school;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		this.Code = code;
	}
	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	
}
