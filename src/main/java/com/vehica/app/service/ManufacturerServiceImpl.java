package com.vehica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.ManufacturerRepository;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	private ManufacturerRepository manufacturerRepository;

	@Override
	public long getIdByManufName(String mnfName) {
		// TODO Auto-generated method stub
		return manufacturerRepository.findIdByManfName(mnfName);
	}

}
