package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Account_manager;

@Repository
public interface AccountManagerRepo extends JpaRepository<Account_manager,Long> {
	Optional<Account_manager> findAccount_managerById(Long id);
	public void deleteManagerById(Long id);

}
