package com.abdullah_aladham.kalemati.Model;

import java.util.Date;

import jakarta.persistence.*;


@Entity
public class Requests {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	protected Long id;
	@Column(nullable=false)
	protected String name;//request name
	@Column(nullable=false)
	protected Date request_date;
	@Column(nullable=false)
	protected String requestCode;
	@Column(nullable=false)
	private boolean isdeleted;
	@Column(nullable=false)
	private boolean isRejected;
//	@Column(nullable=false)
//	protected School customer;
//	@Column(nullable=false)
//	protected Teacher teacher;
	
//	private School customer;

	public boolean isIsdeleted() {
		return isdeleted;
	}
	public void setIsdeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}
	public boolean isRejected() {
		return isRejected;
	}
	public void setRejected(boolean isRejected) {
		this.isRejected = isRejected;
	}
	public Requests(Long id, String name, Date request_date, String requestCode,School customer) {
		this.id = id;
		this.name = name;
		this.request_date = request_date;
		this.requestCode = requestCode;
//		this.customer=customer;
	}
	public Requests() {
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRequest_date() {
		return request_date;
	}
	public void setRequest_date(Date request_date) {
		this.request_date = request_date;
	}
//	public School getCustomer() {
//		return customer;
//	}
//	public void setCustomer(School customer) {
//		this.customer = customer;
//	}
//	
//	public School getCustomer() {
//		return customer;
//	}
//	public void setCustomer(School customer) {
//		this.customer = customer;
//	}
}
