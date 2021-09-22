package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Manufacture;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacture, Long> {

	@Query(value = "select mnf_id from manufacturer where mnf_name =?1", nativeQuery = true)
	public long findIdByManfName(String mnfName);

}
