package com.vehica.app.service;

public interface InteriorService {

	public String findInteriorInfo(long modelId);

	public long findAcId(long modelId);

	public String findAirbags(long modelId);

	public long findMusicId(long modelId);

	public String findLeatherSeat(long modelId);

}
