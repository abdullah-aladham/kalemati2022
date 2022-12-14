package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Exceptions.CardNotFoundException;
import com.abdullah_aladham.kalemati.Exceptions.TeacherNotFoundException;
import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Model.Teacher;
import com.abdullah_aladham.kalemati.Repo.TeacherRepo;
@Service
public class TeacherServices {

	private final TeacherRepo teacherRepo;
	
	@Autowired
	public TeacherServices() {
		this.teacherRepo = null;}
	
	public TeacherServices(TeacherRepo teacherRepo) {
		this.teacherRepo=teacherRepo;
	}
	
public Teacher addTeacher(Teacher teacher) {
	teacher.setTeacherCode(UUID.randomUUID().toString());
	return teacherRepo.save(teacher);
}
public List<Teacher> findAllTeachers(){
	return teacherRepo.findAll();
}
public List<Teacher> findTeacherById(long id) {
	return (List<Teacher>) teacherRepo.findTeacherById(id).orElseThrow(()->new TeacherNotFoundException("the Teacher  that you looking for is not found"));
}
public Teacher UpdateTeacher(Teacher teacher) {
return	teacherRepo.save(teacher);
}
public void DeleteTeacher(Long id) {
	teacherRepo.deleteTeacherById(id);
}
}
