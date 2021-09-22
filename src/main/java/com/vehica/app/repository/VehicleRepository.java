package com.vehica.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehica.app.model.VehicleModel;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleModel, Long> {

}
