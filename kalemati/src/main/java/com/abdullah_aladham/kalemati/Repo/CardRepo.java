package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Cards;
@Repository
public interface CardRepo {
	Optional<Cards> findCardById(long id);

//	static void deleteCardById(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
}
