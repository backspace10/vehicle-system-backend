package com.vehica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.AcRepository;

@Service
public class AcServiceImpl implements AcService {

	@Autowired
	private AcRepository acRepository; 
	
	@Override
	public String findAcName(long acId) {
		// TODO Auto-generated method stub
		return acRepository.getAcNameById(acId);
	}

}
