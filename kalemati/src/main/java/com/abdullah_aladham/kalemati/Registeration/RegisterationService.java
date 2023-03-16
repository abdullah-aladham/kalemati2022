package com.abdullah_aladham.kalemati.Registeration;

import com.abdullah_aladham.kalemati.Registeration.Token.ConfirmationToken;
import com.abdullah_aladham.kalemati.Services.ConfirmationTokenService;
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
	private final ConfirmationTokenService confirmationTokenService;
	


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
	public String confirmToken(String token){
		ConfirmationToken confirmationToken =confirmationTokenService
				.getToken(token)
				.orElseThrow(()->
						new IllegalStateException("token not found"));
		if(confirmationToken.getConfirmedAt() !=null){
			throw new IllegalStateException("email already confirmed");
		}

}
