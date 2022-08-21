package com.abdullah_aladham.kalemati.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Requests;

public interface RequestRepo extends JpaRepository<Requests,Long>{
//	Optional<Requests> FindReqById(Long id);
//	Optional<Requests> FindReqByName(String name);
//	Optional<Requests> FindReqBy(Long id);

}
