package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

	@Query(value = "select mdl_id from models where mdl_name = ?1", nativeQuery = true)
	public long getModelIdByName(String modelName);

	@Query(value = "select mdl_name from models where mnf_fk=?1 and seg_fk=?2", nativeQuery = true)
	public List<String> getModelsName(long segId1, long segId2);

	
	@Query(value = "select mdl_price from models where mdl_id=?1", nativeQuery = true)
	public String getModelsPrice(long modelId);

}
