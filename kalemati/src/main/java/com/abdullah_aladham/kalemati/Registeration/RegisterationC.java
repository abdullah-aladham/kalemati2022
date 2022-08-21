package com.abdullah_aladham.kalemati.Registeration;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.kalemati.Registeration.*;
import lombok.AllArgsConstructor;
@RestController
@RequestMapping(path="api/v1/registr")
@AllArgsConstructor
public class RegisterationC {
	private RegisterationService registrationService;

	public String register(@RequestBody RegisterationRequest request) {
		return registrationService.register(request);
	}
}
