package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.kalemati.Model.School;

import com.abdullah_aladham.kalemati.Services.SchoolService;
@RestController
@RequestMapping("/customer")
public class CustomerResource {
	private final  SchoolService customerService; 

	public CustomerResource(SchoolService customerService) {
	this.customerService=customerService;
}
	public CustomerResource() {
		this.customerService = null;}

//@GetMapping("/all")
//public ResponseEntity<List<School>> getAllCustomers(){
//	List<School> customers =customerService.findallSchools();
//	return new ResponseEntity<>(customers, HttpStatus.OK);
//}


//@GetMapping("/find/{id}")
//public ResponseEntity<School> getCustomerById(@PathVariable("id")Long id){
//	School customer =customerService. findSchoolById(id);
//	return new ResponseEntity<>(customer, HttpStatus.OK);
//}

//@PostMapping("/add")
//public ResponseEntity<School> addCustomer(@RequestBody School customer){
//	School Newcustomer =customerService.addSchool(customer);
//	return new ResponseEntity<>(Newcustomer,HttpStatus.CREATED);
//	
//}
//@PutMapping("/update")
//public ResponseEntity<School> updateCustomer(@RequestBody School customer){
//	School updateCustomer =customerService.UpdateCustomer(customer);
//	return new ResponseEntity<>(updateCustomer,HttpStatus.OK);
//	
//}
//@DeleteMapping("/delete/{id}")
//public ResponseEntity<?> deleteCustomer(@PathVariable("id")Long id){
//	customerService. DeleteCustomer(id);
//	return new ResponseEntity<>(HttpStatus.OK);
//	
//}
}
