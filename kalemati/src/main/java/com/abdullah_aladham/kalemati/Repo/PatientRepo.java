package com.abdullah_aladham.kalemati.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Patients;
public interface PatientRepo extends JpaRepository<Patients,Long>{
//	void deleteCustomerById(Long id);

//	Optional<School>  findSchoolById(Long id);
//	Optional<School> findSchoolByName(String name);
//	Optional<School> findSchoolByLocation(String location);
//	Optional<School> findSchoolsByIdAndName(String name,Long id);
//	Optional<School> findSchoolsByIdNameAndLocation(String name,Long id,String location);
	

}
