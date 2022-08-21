package com.abdullah_aladham.kalemati.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abdullah_aladham.kalemati.Model.Audit_log;

public interface AuditRepo extends JpaRepository<Audit_log,Long>{

}
