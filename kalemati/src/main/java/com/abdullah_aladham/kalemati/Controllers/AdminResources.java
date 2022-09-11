package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.abdullah_aladham.kalemati.Controllers.Interfaces.adminController_interface;
//import com.abdullah_aladham.Kalemati21.Model.Patients;
//import com.abdullah_aladham.Kalemati21.Model.School;
//import com.abdullah_aladham.Kalemati21.Model.Teacher;
import com.abdullah_aladham.kalemati.Services.AdminServices;
//import com.abdullah_aladham.Kalemati21.Services.PatientsService;
//import com.abdullah_aladham.Kalemati21.Services.SchoolService;

@RestController
@RequestMapping("/admin")
public class AdminResources  {
	private final  AdminServices adminService; 
	
	

	@Autowired
	public AdminResources(AdminServices adminService) {
		
		this.adminService = adminService;
	}

//	@Override
//	@GetMapping("/all")
//
//	public ResponseEntity<List<Admin>> getAllAdmins() {
//		// TODO Auto-generated method stub
//		List<Admin> schools =adminService.findallAdmins();
//		return new ResponseEntity<>(schools, HttpStatus.OK);
////	}

//	@Override
//	@GetMapping("/sch-names")
//
//	public ResponseEntity<List<School>> getAllSchoolsNames() {
//		// TODO Auto-generated method stub
////		List<School> query=schoolservice
//		return null;
//	}
//
//	@Override
//	@GetMapping("/sch-loc")
//
//	public ResponseEntity<List<School>> getAllSchoolLocations() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@GetMapping("/allsc/id")
//
//	public ResponseEntity<List<School>> getAllSchoolsIDs() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@GetMapping("teacher/all")
//
//	public ResponseEntity<List<Teacher>> getAllTeachers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@GetMapping("teacher/name")
//
//	public ResponseEntity<List<Teacher>> getAllTeacherNames() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	
//	public ResponseEntity<List<Teacher>> getAllTeacherLocations() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Teacher>> getAllTeachersIDs() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildren() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildrenIDs() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildrenLocations() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildrenNames() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildrenAges() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Patients>> getAllchildren_Disabilities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Teacher>> AddTeacher() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Teacher>> AddTeacherLocation() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<Teacher>> AddTeacherID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocations() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndChildID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
////	@Override
////	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildName() {
////		// TODO Auto-generated method stub
////		return null;
////	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByNameandLocationsAndTeacherNameAndTeacherIDAndChildNameAndChildID() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ResponseEntity<List<School>> getSchoolsByChildDisability() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
