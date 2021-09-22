package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.DefaultSpecification;

@Repository
public interface DefaultSpecificationRepo extends JpaRepository<DefaultSpecification, Long> {

	@Query(value = "select engine,mileage,seat_capacity,tyre from default_specification where mdl_id = ?1", nativeQuery = true)
	public String getDefaultSpecOfModelById(long modelId);
	
}
