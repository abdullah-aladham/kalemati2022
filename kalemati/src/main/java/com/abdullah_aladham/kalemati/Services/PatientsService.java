package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Exceptions.ChildNotFoundException;
import com.abdullah_aladham.kalemati.Model.Patients;
import com.abdullah_aladham.kalemati.Repo.PatientRepo;


@Service
public class PatientsService {
	private final PatientRepo childRepo;

	public PatientsService() {
		this.childRepo=null;
	}
	public PatientsService(PatientRepo customerRepo) {
		this.childRepo=customerRepo;
	}
	public Patients addChild(Patients child) {
	child.SetCode(UUID.randomUUID().toString());
	return childRepo.save(child);
	}

	public List<Patients> findallChildren(){
		return childRepo.findAll();
	}

//	public Patients findChildById(Long id) {
//	return  childRepo.findChildById(id).orElseThrow(()->new ChildNotFoundException("The user id"+id+" is not found"));	
//	}
//	public Patients findChildWithname(String name) {
//		return childRepo.findChildByname(name).orElseThrow(()->new ChildNotFoundException("The child with"+name+" is not found"));
//	}
//	public Patients findChildByLocation(String location) {
//		return childRepo.findChildLocation(location).orElseThrow(()->new ChildNotFoundException("The child with"+location+" is not found"));
//	}
//	public Patients findChildWithIdandName(String id,String name) {
//		return childRepo.findChildByIdAndName(id, name).orElseThrow(()->new ChildNotFoundException("The child with"+id+" and "+name+" is not found"));
//	}
//	public Patients findChildWithIdNameAndLocation(String name,Long id ,String loc) {
//		return childRepo.findChildByIdAndNameAndLocation(id,name, loc).orElseThrow(()->new ChildNotFoundException("The child with"+id+", "+name+" and "+loc+" is not found"));
//	}
	public Patients UpdateChild(Patients child) {
		return childRepo.save(child);
	}

//	public void DeleteChild(Long id) {
//		ChildRepo.deleteChildById(id);
//	}
public Patients isdeleted(boolean deleted) {
	return childRepo.isdeleted(deleted).orElseThrow(()->new ChildNotFoundException("The child is not deleted"));
}

}
