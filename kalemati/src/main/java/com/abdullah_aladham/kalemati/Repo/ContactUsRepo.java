package com.abdullah_aladham.kalemati.Repo;

import com.abdullah_aladham.kalemati.Model.Cards;
import com.abdullah_aladham.kalemati.Model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ContactUsRepo extends JpaRepository<ContactUs,Long> {
    Optional<ContactUs> findContactUsById(Long Id);
}

