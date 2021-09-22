package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Exterior;

@Repository
public interface ExteriorRepository extends JpaRepository<Exterior, Long> {

	@Query(value = "select color_id from exterior where model_id= ?1", nativeQuery = true)
	public long findColorIdByModelId(long modelId);

	@Query(value = " select clr_name from colors where clr_id= ?1", nativeQuery = true)
	public String findColorNameByColorId(long colorId);

	
	@Query(value = "select fog_light_id from exterior where model_id = ?1", nativeQuery = true)
	public long findFogLightIdByColorId(long modelId);

	@Query(value = "select fog_light_name from fog_light where fog_light_id = ?1", nativeQuery = true)
	public String findFogLightNameByFogLightId(long foglightId);
	
	
	@Query(value = "select tyre_id from exterior where model_id = ?1", nativeQuery = true)
	public long findTyreIdByModelId(long modelId);

	@Query(value = " select tyre_name from tyre where tyre_id = ?1", nativeQuery = true)
	public String findTyreNameByTyreId(long tyreId);
	
}
