package com.abdullah_aladham.kalemati.Model;

import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.*;



@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long Id;
	@Column(nullable=false)
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
	@Column(nullable=false)
	private boolean isdeleted;
	@Column(nullable=false)
	protected boolean isBlocked;
	
//	@ManyToMany(targetEntity=Requests.class,cascade=CascadeType.ALL)
//	@JoinColumn(name="Request_id",referencedColumnName="id")
//	private Requests requests;
//	@Column
// Patients children;

//	@Column
//	Set<Subscriptions> sub=new HashSet();//this is meant for not letting the school immediately access to cards and not letting them forever access
//	@Column()
//	Set<cards> card;//i don't know really if school should be connected to cards immediately
//	@Column(nullable=false)
//	Set<Teacher> teachers=new HashSet();
	@ManyToMany(targetEntity=Teacher.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Teacher_Id")
	private List<Teacher>Sc_teachers;
	@OneToOne(targetEntity=Account_manager.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Principal_id",referencedColumnName="id")
	private Account_manager Principal;
	@ManyToMany(targetEntity=Patients.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Patients")
	private List<Patients>patients;
	@Column(nullable=false,name="is_blocked")
	boolean isblocked;//checks if schools is blocked or not
	
	School(Long id,String schoolname,String lastname,String Ccode,Patients children,Set<Teacher>teachers,boolean blocked,Set<Subscriptions>subs){
		
		this.Id=id;
		this.SchoolName=schoolname;

		
		this.CustomerCode=Ccode;
//		this.children=children;
//		this.teachers=teachers;
		this.isblocked=blocked;
	}
	public School() {
		
	}
public Long getId() {
	return Id;
	
}
public void setId(Long id) {
	this.Id=id;
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
//public boolean ismatch(String pass,String cpass) {
//	if(pass.equals(cpass) || cpass.equals(pass)) {
//		return true;
//	}
//	else return false;
//}
@Override
public String toString() {
	return "Customer "+"id="+Id+","+"SchoolName"+SchoolName+", School Code:"+CustomerCode;
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
