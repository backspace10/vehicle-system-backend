package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.MusicSystem;

@Repository
public interface MusicRepository extends JpaRepository<MusicSystem, Long> {

	@Query(value = "select music_name from music_system where music_id = ?1", nativeQuery = true)
	public String findMusicNameByMusicId(long musicId);

	@Query(value = "select music_name from music_system where music_config in (select music_config from models where mdl_id = ?1)", nativeQuery = true)
	public List<String> findMusicNameByModelsId(long modelId);

	@Query(value = "select music_price from music_system where music_name = ?1", nativeQuery = true)
	public String findMusicPrice(String musicName);

	
}
