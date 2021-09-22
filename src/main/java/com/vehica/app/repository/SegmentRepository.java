package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Segment;



@Repository
public interface SegmentRepository extends JpaRepository<Segment, Long> {

//	@Query(value = "SELECT seg_name FROM segment WHERE seg_id in (?, ?, ?, ?, ?)", nativeQuery = true)
//	public List<String> findBySegmentName(long id, long id2, long id3, long id4, long id5);
	@Query(value = "select seg_name from segment", nativeQuery = true)
	public List<String> findBySegmentName();

	@Query(value = "select seg_id from segment where seg_name = ?1", nativeQuery = true)
	public long findIdByName(String name);
	
	@Query(value = "select mnf_name from manufacturer where mnf_id in (select mnf_fk from models where seg_fk = ?1)", nativeQuery = true)
	public List<String> getManufacturersBySegId(long segId);
	

	

	

}
