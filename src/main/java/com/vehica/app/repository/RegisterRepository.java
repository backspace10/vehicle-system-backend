package com.vehica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.Register;

@Repository
public interface RegisterRepository extends JpaRepository<Register, Long>{
	@Query(value = "SELECT username FROM register WHERE username = ?1", nativeQuery = true)
	String findByUsername(String username);
	
	@Query(value = "SELECT password FROM register WHERE password = ?1", nativeQuery = true)
	String findByPassword(String password);

	@Query(value = "select name, address, contact from register where username = ?1", nativeQuery = true)
	String findByUserName(String userName);


	@Query(value = "select email from register where username = ?1", nativeQuery = true)
	String findMailByUserName(String userName);
	
	@Query(value = "select name from register where username = ?1", nativeQuery = true)
	String findFullName(String userName);

}


