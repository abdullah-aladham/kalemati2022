package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdullah_aladham.Kalemati21.Exceptions.SubscriptionNotFoundException;
import com.abdullah_aladham.Kalemati21.Model.Subscriptions;
import com.abdullah_aladham.Kalemati21.Repo.SubscriptionRepo;


@Service
public class SubsService {
	private final SubscriptionRepo subRepo;
	 
	 public SubsService() {
		 this.subRepo=null;
	 }
	
	public SubsService(SubscriptionRepo subRepo) {
		this.subRepo=subRepo;
	}
//	public Subscriptions addsub(Subscriptions sub) {
//		sub.SetCode(UUID.randomUUID().toString());
//		return subRepo.save(sub);
//	}
	public List<Subscriptions> findAllSubs(){
		return subRepo.findAll();
	}
	public Subscriptions findSubscriptionById(Long id) {
		return subRepo.findSubscriptionById(id).orElseThrow(()->new SubscriptionNotFoundException("The Subscription that you are looking is not found") );
	}
	public Subscriptions updateSubscription(Subscriptions sub) {
		return subRepo.save(sub);
	}
	public void DeleteSub(Long id) {
		subRepo.deleteSupscriptionById(id);
	}
	/*public void updateSubDate(Subscriptions sub,Date newdate) {
		sub.
	}*/
}
