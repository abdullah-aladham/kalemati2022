package com.abdullah_aladham.kalemati.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Subscriptions;

public interface SubscriptionRepo extends JpaRepository<Subscriptions,Long> {
	Optional<Subscriptions> findSubscriptionById(Long id);
	void deleteSupscriptionById(Long id);
	Op
}
