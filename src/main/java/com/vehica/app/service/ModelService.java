package com.vehica.app.service;

import java.util.List;

public interface ModelService {

	public long findModelId(String modelName);
	public List<String> getAllModelsName(long segId, long segId2);
	public String findModelPriceById(long modelId);
	
}
