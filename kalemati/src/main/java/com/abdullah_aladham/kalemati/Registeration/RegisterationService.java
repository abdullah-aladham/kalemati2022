package com.abdullah_aladham.kalemati.Registeration;

import com.abdullah_aladham.kalemati.Registeration.*; 

public class RegisterationService {
	private EmailValidator emailValidator;
	public String register(RegisterationRequest request) {
		// TODO Auto-generated method stub
		boolean IsValidEmail=emailValidator.
				test(request.getEmail());//variable for storing boolean result of email validation
		if(!IsValidEmail) {
			throw new IllegalStateException("email not valid");
		}
		
		return "works";
	}
}
