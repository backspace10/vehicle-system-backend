package com.vehica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.DefaultSpecificationRepo;

@Service
public class DefaultSpecificationImpl implements DefaultSpecificationService {

	@Autowired
	private DefaultSpecificationRepo defaultSpecificationRepo;

	@Override
	public String getDefaultSpec(long modelId) {
		// TODO Auto-generated method stub
		return defaultSpecificationRepo.getDefaultSpecOfModelById(modelId);
	}
}
