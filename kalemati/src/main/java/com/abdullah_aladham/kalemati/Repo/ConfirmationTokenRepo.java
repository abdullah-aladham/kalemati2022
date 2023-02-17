package com.abdullah_aladham.kalemati.Repo;


import com.abdullah_aladham.kalemati.Registeration.Token.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepo
        extends JpaRepository<ConfirmationToken,Long> {
    Optional<ConfirmationToken> findByToken(String Token);
}
