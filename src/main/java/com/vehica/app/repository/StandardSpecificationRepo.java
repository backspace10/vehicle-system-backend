package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.StandardSpecification;

@Repository
public interface StandardSpecificationRepo extends JpaRepository<StandardSpecification, Long> {

	@Query(value = "select std_spec_name from standard_specification", nativeQuery = true)
	public List<String> findByStdSpecNames();

}
