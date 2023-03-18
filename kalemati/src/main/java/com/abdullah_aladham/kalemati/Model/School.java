package com.abdullah_aladham.kalemati.Model;

import java.util.List;
import java.util.Set;

import lombok.AllArgsConstructor;
import org.hibernate.annotations.Cascade;

import jakarta.persistence.*;



@Entity
@AllArgsConstructor

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
	@ManyToOne(targetEntity=Teacher.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Teacher_Id")
	private List<Teacher>teachers;
	@OneToOne(targetEntity=Account_manager.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Principal_id",referencedColumnName="id")
	private Account_manager Principal;
	@OneToMany(targetEntity=Patients.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Patients_Id",referencedColumnName = "id")
	private List<Patients>patients;

//	@Column(nullable=false,name="isblocked")
//	boolean isblocked;//checks if schools is blocked or not
	

public Long getId() {
	return Id;
	
}
public void setId(Long id) {
	this.Id=id;
}

public String getCode() {
	return CustomerCode;
}
public void setCode(String newCode) {
	this.CustomerCode=newCode;
}

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

public boolean isBlocked() {
	return isBlocked;
}

public void setBlocked(boolean isBlocked) {
	this.isBlocked = isBlocked;
}

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


}
