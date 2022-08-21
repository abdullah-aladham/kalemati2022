package com.abdullah_aladham.kalemati.Model;

import java.util.Date;



//import com.abdullah_aladham.Kalemati21.Model.School;

import jakarta.persistence.*;

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
	
	
//boolean didend;
//	@Column(nullable=false)

//private School User;
//private String Code;

Subscriptions(Long id ,String name,Date start,Date end,String token,School uid,boolean deleted){
	this.id=id;
	this.sub_name=name;
	this.sub_start=start;
	this.sub_end=end;
	this.subtoken=token;
	this.isdeleted=deleted;
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
//public String getCode() {
//	return Code;
//}
//public void SetCode(String NewCode) {
//	this.Code=NewCode;
//}

}
