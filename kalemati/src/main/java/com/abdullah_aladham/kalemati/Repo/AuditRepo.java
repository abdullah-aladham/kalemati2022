package com.abdullah_aladham.kalemati.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdullah_aladham.kalemati.Model.Audit_log;
@Repository
public interface AuditRepo extends JpaRepository<Audit_log,Long>{

}
