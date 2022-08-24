package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Repo.CardRepo;
//import com.abdullah_aladham.Kalemati21.Repo.CardRepo;
import com.abdullah_aladham.kalemati.Exceptions.*;


@Service
public class CardsService {
	

	private final CardRepo cardRepo;
	
	@Autowired
	public CardsService() {
		this.cardRepo = null;}
	public CardsService(CardRepo cardRepo) {
		this.cardRepo=cardRepo;
	}
	
public Cards addCard(Cards card) {
	card.SetCode(UUID.randomUUID().toString());
	return cardRepo.save(card);
}
public List<Cards> findAllCards(){
	return cardRepo.findAll();
}
public Cards findCardById(long id) {
	return cardRepo.findCardById(id).orElseThrow(()->new CardNotFoundException("the card  that you looking for is not found"));
}
public Cards UpdateCard(Cards card) {
return	cardRepo.save(card);
}
public void DeleteCard(Long id) {
	cardRepo.deleteCardById(id);
}
 
}
