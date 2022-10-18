package com.abdullah_aladham.kalemati.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Requests;
@Repository
public interface RequestRepo extends JpaRepository<Requests,Long>{
	List<Requests> getRequestById(Long id);
//	boolean deleteRequest(Long id);
//	Optional<Requests> FindReqByName(String name);
//	Optional<Requests> FindReqBy(Long id);

}
