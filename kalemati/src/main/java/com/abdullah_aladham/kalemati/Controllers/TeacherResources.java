package com.abdullah_aladham.kalemati.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.abdullah_aladham.alemati.Controllers.Interfaces.TeacherCInterface;
import com.abdullah_aladham.kalemati.Model.Patients;
import com.abdullah_aladham.kalemati.Model.Teacher;
import com.abdullah_aladham.kalemati.Services.TeacherServices;


@RestController
@RequestMapping("/teacher")
public class TeacherResources   {
	TeacherServices teacherServices;

	@GetMapping("/all")
	public ResponseEntity<List<Teacher>> getAllTeachers() {
		// TODO Auto-generated method stub
		List<Teacher>result= teacherServices.findAllTeachers();
		return new ResponseEntity<>(result, HttpStatus.OK);
		
	}

	@GetMapping("/find/{Id}")
	public ResponseEntity<List<Teacher>> getTeacherById(Long Id) {
		List<Teacher> result = teacherServices.findTeacherById(Id);
		return new ResponseEntity<>(result,HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
	Teacher NewTeacher=teacherServices.addTeacher(teacher);
	return new ResponseEntity<>(NewTeacher ,HttpStatus.CREATED);
	}
	@PostMapping("/update")
	public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher){
		Teacher updatedTeacher = teacherServices.UpdateTeacher(teacher);
		return new ResponseEntity<>(updatedTeacher,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Teacher>deleteTeacher(@PathVariable("id")Long id){
		teacherServices.DeleteTeacher(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
