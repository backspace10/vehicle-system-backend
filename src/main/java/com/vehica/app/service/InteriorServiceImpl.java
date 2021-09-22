package com.vehica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.InteriorRepository;

@Service
public class InteriorServiceImpl implements InteriorService {

	@Autowired
	private InteriorRepository interiorRepository;

	@Override
	public String findInteriorInfo(long modelId) {
		return interiorRepository.findInteriorInfoByModelId(modelId);
	}

	@Override
	public long findAcId(long modelId) {
		// TODO Auto-generated method stub
		return interiorRepository.findAcIdByModelId(modelId);
	}

	@Override
	public String findAirbags(long modelId) {
		// TODO Auto-generated method stub
		return interiorRepository.findAirbagsByModelId(modelId);
	}

	@Override
	public long findMusicId(long modelId) {
		// TODO Auto-generated method stub
		return interiorRepository.findmusicIdByModelId(modelId);
	}

	@Override
	public String findLeatherSeat(long modelId) {
		// TODO Auto-generated method stub
		return interiorRepository.findLeatherSeatByModelId(modelId);
	}

}
