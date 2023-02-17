package com.abdullah_aladham.kalemati.Model;

import java.util.Date;
import java.util.List;

//import com.abdullah_aladham.Kalemati21.Model.School;

import jakarta.persistence.*;
@Entity
public class Subscriptions {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)

private Long id;
	@Column(nullable=false)

private String sub_name;
	@Column(nullable=false)
	
private Date  sub_start;
	@Column(nullable=false)

private Date sub_end;
	
	@Column(nullable=false)
private String subtoken;
	@Column(nullable=false)
	private boolean isdeleted;
	@Column(nullable=false)
	private boolean isStopped;
	@Column(nullable=false)
	private boolean isSuspended;
	
	
	
//boolean didend;
//	@Column(nullable=false)

//private School User;
	@Column(nullable=false)
private String Code;

public Subscriptions(Long id ,String name,Date start,Date end,boolean deleted,String code,boolean isSuspended){
	this.id=id;
	this.sub_name=name;
	this.sub_start=start;
	this.sub_end=end;
	this.isdeleted=deleted;
	this.Code=code;
	this.isSuspended = isSuspended;
//	this.User=uid;
}
public Subscriptions() {
	
}
public Long getid() {
	return id;

}
public void setId(Long newId) {
	this.id=newId;
}
public String getName() {
	return sub_name;
}
public void Setname(String newname) {
	this.sub_name=newname;
}
public Date getStartDate() {
	return sub_start;
}
public void setStartDate(Date newdate) {
	this.sub_start=newdate;
}
public Date GetendDate() {
	return sub_end;
}
public void setEnd(Date newEnd) {
	this.sub_end=newEnd;
}
public String getCode() {
	return Code;
}
public void SetCode(String NewCode) {
	this.Code=NewCode;
}
public boolean isSuspended() {
	return isSuspended;
}
public void setSuspended(boolean isSuspended) {
	this.isSuspended = isSuspended;
}

}
