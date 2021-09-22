package com.vehica.app.service;

import java.util.List;

public interface ColorsService {

	public List<String> getColorsList(long modelId);
	public String findColorPrice(String colorName);
}
