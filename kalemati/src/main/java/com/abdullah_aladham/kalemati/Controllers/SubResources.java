package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.kalemati.Model.Subscriptions;
import com.abdullah_aladham.kalemati.Services.*;


@RestController
@RequestMapping("/subs")
public class SubResources {
	
	private final  SubsService subService; 
	@Autowired
	public SubResources(SubsService subService) {
		this.subService=subService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Subscriptions>> getAllCustomers(){
		List<Subscriptions> subs = subService.findAllSubs();
		return new ResponseEntity<>(subs, HttpStatus.OK);
	}


	@GetMapping("/find/{id}")
	public ResponseEntity<Subscriptions> getSubById(@PathVariable("id")Long id){
		Subscriptions sub =subService. findSubscriptionById(id);
		return new ResponseEntity<>(sub, HttpStatus.OK);
	}

	//@PostMapping("/add")
	/*public ResponseEntity<Subscriptions> addSub(@RequestBody Subscriptions sub){
		Subscriptions newSub =subService.addsub(sub);
		return new ResponseEntity<>(newSub,HttpStatus.CREATED);
		
	}*/
	@PutMapping("/update")
	public ResponseEntity<Subscriptions> updateCustomer(@RequestBody  Subscriptions sub){
		Subscriptions updateSub = subService. updateSubscription(sub);
		return new ResponseEntity<>(updateSub,HttpStatus.OK);
		
	}
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<?> deleteSub(@PathVariable("id")Long id){
//		subService.  DeleteSub(id);
//		return new ResponseEntity<>(HttpStatus.OK);
//		
//	}
	
}
