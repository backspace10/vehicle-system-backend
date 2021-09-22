package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.ColorsRepository;

@Service
public class ColorsServiceImpl implements ColorsService {

	@Autowired
	private ColorsRepository colorsRepository;

	@Override
	public List<String> getColorsList(long modelId) {
		// TODO Auto-generated method stub
		return colorsRepository.getColorsListByModelId(modelId);
	}

	@Override
	public String findColorPrice(String colorName) {
		// TODO Auto-generated method stub
		return colorsRepository.getColorPrice(colorName);
	}

}
