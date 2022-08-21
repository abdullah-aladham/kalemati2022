package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Admin;

public interface AdminRepo extends JpaRepository<Admin,Long> {
//	Optional<Patients> findChildById(Long id);

}
