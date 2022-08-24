package com.abdullah_aladham.kalemati.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.abdullah_aladham.kalemati.Exceptions.ChildNotFoundException;
import com.abdullah_aladham.kalemati.Model.Account_manager;
import com.abdullah_aladham.kalemati.Repo.AccountManagerRepo;

@Service
public class AccountManagerServices  {
	AccountManagerRepo accRepo;

	public AccountManagerServices(AccountManagerRepo accRepo) {
		this.accRepo = accRepo;
	}
	public List<Account_manager> GetAll() {
		return accRepo.findAll();
	}
	public Account_manager findManagerById(Long id) {
		return accRepo.findAccount_managerById(id).orElseThrow(()->new ChildNotFoundException("The user id"+id+" is not found"));
	}
	public Account_manager addAccountManager(Account_manager manager) {
		manager.setCode(UUID.randomUUID().toString());
		return accRepo.save(manager);
	}
	public Account_manager updateManager(Account_manager mgr) {
		return accRepo.save(mgr);
	}
	public void deleteMgr(Long id) {
		accRepo.deleteManager(id);
	}

	
}
