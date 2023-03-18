package com.abdullah_aladham.kalemati.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false ,updatable=false)
	private Long id;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String phoneNo;
	@Column(nullable=false)
	private String desciption;//this is teacher description
	@Column(nullable=false)
	private String email;//teacher email
	@Column(nullable=false)
	private String major;//teacher major
	@Column(nullable=false)
	private String TeacherCode;
	@Column(nullable=false)
	private boolean isdeleted;
//	@Column(nullable=false)
//    private School school;
	@OneToOne(targetEntity=School.class,cascade=CascadeType.ALL)
	@JoinColumn(name="School_id",referencedColumnName="Id")
	private School School;
	@ManyToMany(targetEntity=Patients.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Patient_id",referencedColumnName="id")
	private List<Patients> patients;

	
	public String getTeacherCode() {
		return TeacherCode;
	}
	public void setTeacherCode(String teacherCode) {
		TeacherCode = teacherCode;
	}
	public Teacher() {
		
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



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getDesciption() {
		return desciption;
	}



	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}
	



//	public Set<School> getSchool() {
//		return school;
//	}
//
//
//
//	public void setSchool(Set<School> school) {
//		this.school = school;
//	}



	public String getInfo() {
		return "teacher id="+this.id+"teacher name is"+this.name;
	}
}
