package com.abdullah_aladham.kalemati.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Requests;

public interface RequestRepo extends JpaRepository<Requests,Long>{
	List<Requests> FindReqById(Long id);
//	Optional<Requests> FindReqByName(String name);
//	Optional<Requests> FindReqBy(Long id);

}
