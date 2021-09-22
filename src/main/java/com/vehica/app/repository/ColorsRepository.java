package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Colors;

@Repository
public interface ColorsRepository extends JpaRepository<Colors, Long> {

	@Query(value = "select clr_name from colors where clr_config in (select color_config from models where mdl_id=?1)", nativeQuery = true)
	public List<String> getColorsListByModelId(long modelId);
	
	
	@Query(value = "select clr_price from colors where clr_name=?1", nativeQuery = true)
	public String getColorPrice(String clrName);
		
}
