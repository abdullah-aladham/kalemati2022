package com.abdullah_aladham.kalemati.Services;

import com.abdullah_aladham.kalemati.Registeration.Token.ConfirmationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Model.AppUser;
import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Repo.AppUserRepo;
import com.abdullah_aladham.kalemati.Repo.CardRepo;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Service

public class AppUserService implements UserDetailsService {

	private final String USER_NOT_FOUND_MSG="User with email %s not found";
	 private final AppUserRepo appUserRepo;
	 private final BCryptPasswordEncoder bcryptPasswordEncoder;
	 private final ConfirmationTokenService confirmationTokenService;

	 @Autowired
		public AppUserService(AppUserRepo appUserRepo ,BCryptPasswordEncoder bcryptPasswordEncoder
			 ,ConfirmationTokenService confirmationTokenService) {
			this.appUserRepo=appUserRepo;
			this.bcryptPasswordEncoder=bcryptPasswordEncoder;
			this.confirmationTokenService=confirmationTokenService;

		}
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return appUserRepo.findByEmail(email)
				.orElseThrow(()->new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
	}
	public String signUpUser(AppUser appUser) {
		boolean userExists =appUserRepo.findByEmail(appUser.getEmail())
		.isPresent();
		
	if(userExists) {
		throw new IllegalStateException("Email already taken");
	}
	
	String encodedPassword=bcryptPasswordEncoder.encode(appUser.getPassword());
	appUser.setPassword(encodedPassword);
	 appUserRepo.save(appUser);
		String token=UUID.randomUUID().toString();

		ConfirmationToken Confirmationtoken=new ConfirmationToken(
				token,
				LocalDateTime.now(),
				LocalDateTime.now().plusMinutes(15),
				appUser
		);
		confirmationTokenService.saveConfirmationToken(Confirmationtoken);
		//TODO Send Email
		return token;
		
	}

}
