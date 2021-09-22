package com.vehica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.ExteriorRepository;

@Service
public class ExteriorServiceImpl implements ExteriorService {

	@Autowired
	private ExteriorRepository exteriorRepository;

	@Override
	public long findColorId(long modelId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findColorIdByModelId(modelId);
	}

	@Override
	public String findColorName(long colorId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findColorNameByColorId(colorId);
	}

	@Override
	public long findFogLightId(long modelId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findFogLightIdByColorId(modelId);
	}

	@Override
	public String findFogLightName(long foglightId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findFogLightNameByFogLightId(foglightId);
	}

	@Override
	public long findTyreId(long modelId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findTyreIdByModelId(modelId);
	}

	@Override
	public String findTyreName(long tyreId) {
		// TODO Auto-generated method stub
		return exteriorRepository.findTyreNameByTyreId(tyreId);
	}

}
