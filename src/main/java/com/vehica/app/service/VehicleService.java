package com.vehica.app.service;

import java.util.List;

import com.vehica.app.model.VehicleModel;

public interface VehicleService {

	public List<VehicleModel> getVehicles();

	public VehicleModel getVehicle(long id);

	public VehicleModel saveVehicle(VehicleModel v);

	public VehicleModel updateVehicle(VehicleModel v);

	public void deleteVehicle(long parseLong);

}
