package com.vehica.app.service;

import java.util.List;

public interface MusicSystemService {

	public String findMusicSystemName(long musicId);
	public List<String> findMusicSystemNameByModelId(long modelId);
	public String getMusicSystemPrice(String musicName);
	
}
