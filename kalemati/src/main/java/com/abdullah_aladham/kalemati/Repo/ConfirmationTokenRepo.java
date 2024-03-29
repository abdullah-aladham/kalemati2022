package com.abdullah_aladham.kalemati.Repo;


import com.abdullah_aladham.kalemati.Registeration.Token.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface ConfirmationTokenRepo
        extends JpaRepository<ConfirmationToken,Long> {
    Optional<ConfirmationToken> findByToken(String Token);
    @Transactional
    @Modifying
////    @Query("UPDATE ConfirmationToken c " +
////            "SET c.confirmedAt = ?2 " +
////            "WHERE c.token = ?1")
   int updateConfirmedAt(String token,LocalDateTime confirmedAt);
}
