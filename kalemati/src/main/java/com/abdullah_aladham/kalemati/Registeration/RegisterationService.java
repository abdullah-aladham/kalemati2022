package com.abdullah_aladham.kalemati.Registeration;

import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Model.AppUser;
import com.abdullah_aladham.kalemati.Registeration.*;
import com.abdullah_aladham.kalemati.Security.ApplicationUserRole;
import com.abdullah_aladham.kalemati.Services.AppUserService;

import lombok.AllArgsConstructor; 
@Service 
@AllArgsConstructor
public class RegisterationService {
	private final EmailValidator emailValidator;
	private final AppUserService appUserService;
	
	public RegisterationService(EmailValidator emailValidator, AppUserService appUserService) {
		super();
		this.emailValidator = emailValidator;
		this.appUserService = appUserService;
	}
	public RegisterationService() {
		super();
		this.emailValidator = null;
		this.appUserService = null;
	}

	public String register(RegisterationRequest request) {
		// TODO Auto-generated method stub
		boolean IsValidEmail=emailValidator.
				test(request.getEmail());//variable for storing boolean result of email validation
		if(!IsValidEmail) {
			throw new IllegalStateException("email not valid");
		}
		
		return appUserService.signUpUser(
				new AppUser(request.getFirstName(),request.getLastName(),request.getEmail(),request.getPassword(),ApplicationUserRole.USER));
	}
}
