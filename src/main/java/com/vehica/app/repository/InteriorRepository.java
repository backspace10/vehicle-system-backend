package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Interior;


@Repository
public interface InteriorRepository extends JpaRepository<Interior, Long> {

	@Query(value = "select ac_id, airbags, music_id, leather_seat from interior where model_id = ?1", nativeQuery = true)
	public String findInteriorInfoByModelId(long modelId);

	@Query(value = "select ac_id from interior where model_id = ?1", nativeQuery = true)
	public long findAcIdByModelId(long modelId);

	@Query(value = "select ac_name from interior where ac_id = ?1", nativeQuery = true)
	public long findAcNameByModelId(long modelId);

	@Query(value = "select airbags from interior where model_id = ?1", nativeQuery = true)
	public String findAirbagsByModelId(long modelId);
	
	@Query(value = "select music_id from interior where model_id = ?1", nativeQuery = true)
	public long findmusicIdByModelId(long modelId);
	

	@Query(value = "select leather_seat from interior where model_id = ?1", nativeQuery = true)
	public String findLeatherSeatByModelId(long modelId);
	
	


}
