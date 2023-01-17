package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.abdullah_aladham.kalemati.Model.AppUser;
@Repository
@Transactional(readOnly=true)
public interface AppUserRepo extends JpaRepository<AppUser,Long> {

	Optional<AppUser> findByEmail(String Email);
}
