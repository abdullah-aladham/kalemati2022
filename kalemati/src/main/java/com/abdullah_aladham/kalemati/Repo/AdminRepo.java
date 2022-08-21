package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import com.abdullah_aladham.kalemati.Model.Patients;

public class AdminRepo {
	Optional<Patients> findChildById(Long id);

}
