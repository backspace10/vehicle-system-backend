package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.model.VehicleModel;
import com.vehica.app.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public List<VehicleModel> getVehicles() {
		return vehicleRepository.findAll(); // return all vehicle list from database
	}

	@Override
	public VehicleModel getVehicle(long id) {

		return vehicleRepository.getById(id);

	}

	// add vehicle to db
	@Override
	public VehicleModel saveVehicle(VehicleModel v) {
		return vehicleRepository.save(v);

	}

	@Override
	public VehicleModel updateVehicle(VehicleModel v) {

		return vehicleRepository.save(v); // it will simply update vehicle details

	}

	@Override
	public void deleteVehicle(long parseLong) {

		VehicleModel entity = vehicleRepository.getById(parseLong); // first load entity
		vehicleRepository.delete(entity); // delete entity

	}

}
