package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Ac;

@Repository
public interface AcRepository extends JpaRepository<Ac, Long> {

	@Query(value = "select ac_name from ac where ac_id = ?1", nativeQuery = true)
	public String getAcNameById(long acId);
	
	

}
