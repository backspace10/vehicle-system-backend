package com.vehica.app.service;


public interface ExteriorService {

	public long findColorId(long modelId);
	public String findColorName(long colorId);
	public long findFogLightId(long modelId);
	public String findFogLightName(long foglightId);
	public long findTyreId(long modelId);
	public String findTyreName(long tyreId);
	
}
