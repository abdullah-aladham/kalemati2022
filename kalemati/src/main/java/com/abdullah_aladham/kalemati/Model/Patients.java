package com.abdullah_aladham.kalemati.Model;

import com.abdullah_aladham.kalemati.Enums.GenderEnum;
import com.abdullah_aladham.kalemati.Model.School;
import jakarta.persistence.*;

//import com.abdullah_aladham.Kalemati21.Enums.GenderEnum;
@Entity
public class Patients {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
private Long id;
	@Column(nullable=false)
private String name;
	@Column(nullable=false)
private float age;
	@Column(nullable=false)
private GenderEnum gender;//enum
	@Column(nullable=false)
private String ChildCode;
	@Column(nullable=false)
	private int  disability_level;
	@Column(nullable=false)
	private double exam_result;
	@Column(nullable=false)
	private boolean isdeleted;
//	@Column(nullable=false)
//	private School school;
//	@Column(nullable=false)
//	private Teacher teacher;
	
//	private School school;
//	Set<Teacher>teachers=new HashSet();
//	@ManyToMany
//private	School school;
//public Patients() {}
	/*Relationships for patients*/
	@OneToOne(targetEntity=School.class,cascade=CascadeType.ALL)
	@JoinColumn(name="School_id",referencedColumnName="id")
	private School patient_School;
public Patients(Long id,String name,float age, GenderEnum g, String code,boolean deleted ) {
	this.id=id;
	this.name=name;
	this.age=age;
	this.gender=g;
	this.ChildCode=code;
	this.isdeleted=deleted;
}
public Patients() {
	
}
public Long getId() {
	return id;
}
public void setId(Long newId) {
	this.id=newId;
}

public String getName() {
	return name;
}
public void setName(String newName) {
	this.name=newName;
}
public float getAge() {
	return age;
}
public void setAge(float newAge) {
	this.age=newAge;
}
public GenderEnum getGender() {
	return gender;
}
public void setGender(GenderEnum cgender) {
	this.gender=cgender;
}
public String getCode() {
	return ChildCode;
}
public void SetCode(String newCode) {
	this.ChildCode=newCode;
}

public String toString() {
	return "id: "+id+"Childname: "+name+"Age is: "+age+"gender: "+gender+"ChildCode is: "+ChildCode;
}
public String getChildCode() {
	return ChildCode;
}
public void setChildCode(String childCode) {
	ChildCode = childCode;
}
public int getDisability_level() {
	return disability_level;
}
public void setDisability_level(int disability_level) {
	this.disability_level = disability_level;
}
public double getExam_result() {
	return exam_result;
}
public void setExam_result(double exam_result) {
	this.exam_result = exam_result;
}
public boolean isDeleted() {
	return isdeleted;
}
public void setDeleted(boolean deleted) {
	this.isdeleted = deleted;
}

}
