package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Model.School;
import com.abdullah_aladham.kalemati.Repo.CustomerRepo;
import com.abdullah_aladham.kalemati.Exceptions.UserNotFoundException;
@Service
public class SchoolService {
	private final CustomerRepo customerRepo;

	public SchoolService() {
		this.customerRepo=null;
	}
	public SchoolService(CustomerRepo customerRepo) {
		this.customerRepo=customerRepo;
	}
	public School addSchool(School customer) {
	customer.setCode(UUID.randomUUID().toString());
	return customerRepo.save(customer);
	}

	public List<School> findallSchools(){
		return customerRepo.findAll();
	}
//	public School FindAllSchoolsByname(String name){
//		return customerRepo.findSchoolByName(name).orElseThrow(()->new UserNotFoundException("The user name"+name+" is not found"));
//	}
//	public School FindAllSchoolsByLocation(String Location){
//		return customerRepo.findSchoolByLocation(Location).orElseThrow(()->new UserNotFoundException("The School"+Location+" is not found"));
//	}
	
	
//	public School findSchoolById(Long id) {
//	return  customerRepo.findSchoolById(id).orElseThrow(()->new UserNotFoundException("The user id"+id+" is not found"));	
//	}
//	public School FindAllSchoolsByidandName(String name ,Long id) {
//		return customerRepo.findSchoolsByIdAndName(name, id).orElseThrow(()->new UserNotFoundException("The School"+name+"and"+ id +"is not found"));
//	}
//	public School FindAllSchoolsByIdNameAndLocation(String name,Long id,String Location) {
//		return customerRepo.findSchoolsByIdNameAndLocation(name, id, Location).orElseThrow(()->new UserNotFoundException("The School"+name+"id"+id+"and location"+Location+" is not found"));
//	}
	public School UpdateCustomer(School customer) {
		return customerRepo.save(customer);
	}

	public void DeleteCustomer(Long id) {
		customerRepo.deleteCustomerById(id);
	}
	public void changepass(School c) {
		//if(ismatch(c.setpass(pass),c.setconf(cpass)==true) {
			//customerRepo.save(c);
		}
}
