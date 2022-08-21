package com.abdullah_aladham.kalemati.Registeration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class RegisterationRequest {
	private String Firstname;
	private String last_name;
	private String Phonenumber;
	private String Username;
	private String password;
	private String cpass;
	private String Email;
	
	RegisterationRequest(){
		
	}//Empty constructor for some needs
	RegisterationRequest(String Fname,String Lname, String Phone,String username,String pass,String Cpass,String email){
		this.Firstname=Fname;
		this.last_name=Lname;
		this.Phonenumber=Phone;
		this.password=pass;
		this.cpass=Cpass;
		this.Email=email;
	}
	
	//Getters 
	public String getFirstName() {
		return Firstname;
	}
	public String getLastName() {
		return last_name;
	}
	public String getPhone() {
		return Phonenumber;
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return password;
	}
	public String getCpass() {
		return cpass;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}
//End of Getters
	//Start of Setters 
	public void SetFirstName(String Fname) {
		this.Firstname=Fname;
	}
	public void SetLastname(String lname) {
		this.last_name=lname;
	}
	public void SetPhone(String newNum) {
		this.Phonenumber=newNum;
	}
	public void SetUsername(String Uname) {
		this.Username=Uname;
	}
	public void SetPassword(String pass) {
		this.password=pass;
	}
	public void SetCpass(String confPass) {
		this.cpass=confPass;
	}
	public void SetEmail(String NewEmail) {
		this.Email=NewEmail;
	}
	//End of Setters
}
