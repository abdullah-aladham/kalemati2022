package com.abdullah_aladham.kalemati.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.kalemati.Registeration.RegisterationRequest;
//import com.abdullah_aladham.kalemati.Registeration.RegisterationService;
import com.abdullah_aladham.kalemati.Registeration.RegisterationService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path ="Kalemati/Register/NewUser")
@AllArgsConstructor
public class RegistrationController {
	private final RegisterationService registerationService;
	


	public String register(@RequestBody RegisterationRequest req) {
		return registerationService.register(req);
				
	}

}
