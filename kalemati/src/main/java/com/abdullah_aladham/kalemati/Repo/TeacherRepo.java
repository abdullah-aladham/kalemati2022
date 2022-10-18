package com.abdullah_aladham.kalemati.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long>{
	Optional<Teacher> findTeacherById(Long id);
public	List<Teacher> findAll();
public boolean deleteTeacherById(Long id);
}
