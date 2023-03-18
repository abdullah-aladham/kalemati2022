package com.abdullah_aladham.kalemati.Model;

import java.util.Date;

import com.abdullah_aladham.kalemati.Enums.ReqEnum;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
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
	@ManyToOne(targetEntity=School.class,cascade=CascadeType.ALL)
	@JoinColumn(name="School_id",referencedColumnName="Id")
	private School school;
	@Column(nullable=false)
	private ReqEnum request;
	@OneToOne(targetEntity=Subscriptions.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Subscriptions_id",referencedColumnName="id")
	private Subscriptions subscriptions;

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
