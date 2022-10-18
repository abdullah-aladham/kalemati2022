package com.abdullah_aladham.kalemati.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Patients;
@Repository
public interface PatientRepo extends JpaRepository<Patients,Long>{
//	 void DeletePatientById(Long id);
	public Optional<Patients> findPatientsById(Long id);
//public boolean	isdeleted(boolean deleted);
//	void deleteCustomerById(Long id);

//	Optional<School>  findSchoolById(Long id);
//	Optional<School> findSchoolByName(String name);
//	Optional<School> findSchoolByLocation(String location);
//	Optional<School> findSchoolsByIdAndName(String name,Long id);
//	Optional<School> findSchoolsByIdNameAndLocation(String name,Long id,String location);
	

}
