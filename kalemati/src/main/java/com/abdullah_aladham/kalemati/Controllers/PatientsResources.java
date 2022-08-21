package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abdullah_aladham.kalemati.Model.Patients;
import com.abdullah_aladham.kalemati.Services.*;
@RestController
@RequestMapping("/child")
public class PatientsResources {
	
	private final  PatientsService childService; 
	@Autowired
	public PatientsResources() {
		this.childService = null;}

	public PatientsResources(PatientsService childService) {
	this.childService=childService;
}
	
@GetMapping("/all")
public ResponseEntity<List<Patients>> getAllChildren(){
	List<Patients> children =childService.findallChildren();
	return new ResponseEntity<>(children, HttpStatus.OK);
}

//
//@GetMapping("/find/{id}")
//public ResponseEntity<Patients> getChildById(@PathVariable("id")Long id){
//	Patients child =childService. findChildById(id);
//	return new ResponseEntity<>(child, HttpStatus.OK);
//}

@PostMapping("/add")
public ResponseEntity<Patients> addChild(@RequestBody Patients child){
	Patients Newchild =childService.addChild(child);
	return new ResponseEntity<>(Newchild,HttpStatus.CREATED);
	
}
@PutMapping("/update")
public ResponseEntity<Patients> updateChild(@RequestBody Patients child){
	Patients updateChild =childService.UpdateChild(child);
	return new ResponseEntity<>(updateChild,HttpStatus.OK);
	
}
//@DeleteMapping("/delete/{id}")
//public ResponseEntity<?> deleteChild(@PathVariable("id")Long id){
//	childService. DeleteChild(id);
//	return new ResponseEntity<>(HttpStatus.OK);
//	
//}
}
