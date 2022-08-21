package com.abdullah_aladham.kalemati.Model;

import java.util.Set;

import jakarta.persistence.*;



//import com.abdullah_aladham.Kalemati21.Model.Patients;
//import com.abdullah_aladham.Kalemati21.Model.Subscriptions;
//import com.abdullah_aladham.Kalemati21.Model.Teacher;

public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false,name="school_id")
	private Long id;
	@Column(nullable=false,name="school_name")
	private String SchoolName;
//	@Column(nullable=false)
//	private String Phonenumber;
//	@Column(nullable=false ,updatable=false)
//	private String Username;
//	@Column(nullable=false)
//	private String password;
//	@Column(nullable=false)
//	private String cpass;
//	@Column(nullable=false)
//	private String Email;
	@Column(nullable=false)
	private String CustomerCode;
//	@Column
// Patients children;

//	@Column
//	Set<Subscriptions> sub=new HashSet();//this is meant for not letting the school immediately access to cards and not letting them forever access
//	@Column()
//	Set<cards> card;//i don't know really if school should be connected to cards immediately
//	@Column(nullable=false)
//	Set<Teacher> teachers=new HashSet();
	@Column(nullable=false,name="is_blocked")
	boolean isblocked;//checks if schools is blocked or not
	School(Long id,String schoolname,String lastname,String Ccode,Patients children,Set<Teacher>teachers,boolean blocked,Set<Subscriptions>subs){
		
		this.id=id;
		this.SchoolName=schoolname;

		
		this.CustomerCode=Ccode;
//		this.children=children;
//		this.teachers=teachers;
		this.isblocked=blocked;
	}
	public School() {
		
	}
public Long getId() {
	return id;
	
}
public void setId(Long id) {
	this.id=id;
}
//public String getName() {
//	return Firstname.concat(last_name);
//	
//}
//public void Setname(String Firstname,String Last_name) {
//	this.Firstname=Firstname;
//	this.last_name=Last_name;
//}
//public String get_phonenum() {
//	return Phonenumber;
//}
//public void set_phonenumber(String phonenumber) {
//	this.Phonenumber=phonenumber;
//}
///*public String getusername() {
//	return Username;
//}
//public void setUsername(String Username) {
//	this.Username=Username;
//}*/
//public String getEmail() {
//	return Email;
//}
//public void setEmail(String Email) {
//	this.Email=Email;
//}
public String getCode() {
	return CustomerCode;
}
public void setCode(String newCode) {
	this.CustomerCode=newCode;
}
//
//public String getpass() {
//	return password;
//}
//public void setpass(String newpass) {
//	this.password=newpass;
//}
//public void setconfpass(String newpass) {
//	this.cpass=newpass;
//}
//public String getconfpass() {
//	return cpass;
//}
public boolean ismatch(String pass,String cpass) {
	if(pass.equals(cpass) || cpass.equals(pass)) {
		return true;
	}
	else return false;
}
@Override
public String toString() {
	return "Customer "+"id="+id+","+"SchoolName"+SchoolName+", School Code:"+CustomerCode;
}
//public Patients getChildren() {
//	return children;
//}
//public void setChildren(Patients children) {
//	this.children = children;
//}
//public Subscriptions getSub() {
//	return sub;
//}
//public void setSub(Subscriptions sub) {
//	this.sub = sub;
//}

//public Set<Teacher> getTeachers() {
//	return teachers;
//}
//public Set<Subscriptions> getSub() {
//	return sub;
//}
//public void setSub(Set<Subscriptions> sub) {
//	this.sub = sub;
//}
//public void setTeachers(Set<Teacher> teachers) {
//	this.teachers = teachers;
//}
public boolean isIsblocked() {
	return isblocked;
}
public void setIsblocked(boolean isblocked) {
	this.isblocked = isblocked;
}

}
