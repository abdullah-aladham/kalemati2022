package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.abdullah_aladham.Kalemati21.Model.Child;
import com.abdullah_aladham.kalemati.Model.Requests;
//import com.abdullah_aladham.Kalemati21.Model.School;
import com.abdullah_aladham.kalemati.Services.RequestService;
@RestController
@RequestMapping("req")
public class RequestResources {
	
private final RequestService reqService;

@Autowired
public RequestResources(RequestService reqService) {
	this.reqService = reqService;
}

@GetMapping("/all")
public ResponseEntity<List<Requests>> getAllRequests(){
	List<Requests> req =reqService.findallRequests();
	return new ResponseEntity<>(req, HttpStatus.OK);
}
@GetMapping("/all/{id}")
public ResponseEntity<List<Requests>> getRequestsById(Long id){
	List res =reqService.
}

@PostMapping("/add")
public ResponseEntity<Requests> addRequest(@RequestBody Requests req){
	Requests newReq =reqService.addRequest(req);
	return new ResponseEntity<>(newReq,HttpStatus.CREATED);
	
}
@PostMapping("/update")
public ResponseEntity<Requests> updateRequest(@RequestBody Requests req){
	Requests updatedReq =reqService.updateRequest(req);
	return new ResponseEntity<>(updatedReq,HttpStatus.CREATED);
	
}



}
