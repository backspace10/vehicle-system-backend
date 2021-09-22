package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.ModelRepository;

@Service
public class ModelServiceImpl implements ModelService {

	@Autowired
	private ModelRepository modelRepository;
	@Override
	public long findModelId(String modelName) {
		// TODO Auto-generated method stub
		return modelRepository.getModelIdByName(modelName);
	}
	
	@Override
	public List<String> getAllModelsName(long segId, long segId2) {
		return modelRepository.getModelsName(segId, segId2);
	}

	@Override
	public String findModelPriceById(long modelId) {
		// TODO Auto-generated method stub
		return modelRepository.getModelsPrice(modelId);
	}
	

}
