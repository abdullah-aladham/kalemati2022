package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Model.Requests;
import com.abdullah_aladham.kalemati.Services.CardsService;
import com.abdullah_aladham.kalemati.Services.RequestService;
@RestController
@RequestMapping("/card")
public class CardResources {
	private final CardsService cardsService;
public CardResources(){
	this.cardsService = null;}
	@Autowired
	public CardResources(CardsService cardsService) {
		this.cardsService = cardsService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Cards>> getAllRequests(){
		List<Cards> result =cardsService.findAllCards();
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	@GetMapping("/all/{id}")
	public ResponseEntity<Cards> getRequestsById(Long id){
		Cards res =cardsService.findCardById(id);
		return new ResponseEntity<>(res,HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Cards> addRequest(@RequestBody Cards card){
		Cards newCard =cardsService.addCard(card);
		return new ResponseEntity<>(newCard,HttpStatus.CREATED);
		
	}
	@PostMapping("/update")
	public ResponseEntity<Cards> updateRequest(@RequestBody Cards card){
		Cards updatedCard =cardsService.UpdateCard(card);
		return new ResponseEntity<>(updatedCard,HttpStatus.CREATED);
		
	}
	@DeleteMapping("/delete")
	public ResponseEntity<Cards>deleteCard(@PathVariable("id")Long id){
		cardsService.DeleteCard(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	}
