package com.abdullah_aladham.kalemati.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Repo.AppUserRepo;
import com.abdullah_aladham.kalemati.Repo.CardRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {

	private final String USER_NOT_FOUND_MSG="User with email %s not found";
	 private final AppUserRepo appUserRepo;
	 @Autowired
		public AppUserService () {
			this.appUserRepo = null;}
		public AppUserService(AppUserRepo appUserRepo) {
			this.appUserRepo=appUserRepo;
		}
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return appUserRepo.findByEmail(email)
				.orElseThrow(()->new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG, email)));
	}

}
