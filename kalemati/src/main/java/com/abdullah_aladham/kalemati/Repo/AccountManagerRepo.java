package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Account_manager;


public interface AccountManagerRepo extends JpaRepository<Account_manager,Long> {
	Optional<Account_manager> findAccount_managerById(Long id);
	boolean deleteManager(Long id);

}
