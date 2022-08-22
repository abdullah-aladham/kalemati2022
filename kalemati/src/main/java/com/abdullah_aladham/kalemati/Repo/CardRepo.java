package com.abdullah_aladham.kalemati.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Cards;
@Repository
public interface CardRepo extends JpaRepository<Cards,Long> {
	Optional<Cards> findCardById(long id);

	public boolean deleteCardById(Long id); 
//		// TODO Auto-generated method stub
//		
//	}
}
