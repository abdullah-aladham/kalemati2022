package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.abdullah_aladham.kalemati.Model.AppUser;
@Repository
@Transactional(readOnly=true)
public interface AppUserRepo {

	Optional<AppUser> findByEmail(String Email);
}
