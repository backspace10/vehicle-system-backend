package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.MusicRepository;

@Service
public class MusicSystemServiceImpl implements MusicSystemService {

	@Autowired
	private MusicRepository musicRepository;

	@Override
	public String findMusicSystemName(long musicId) {
		// TODO Auto-generated method stub
		return musicRepository.findMusicNameByMusicId(musicId);
	}

	@Override
	public List<String> findMusicSystemNameByModelId(long modelId) {
		// TODO Auto-generated method stub
		return musicRepository.findMusicNameByModelsId(modelId);
	}

	@Override
	public String getMusicSystemPrice(String musicName) {
		// TODO Auto-generated method stub
		return musicRepository.findMusicPrice(musicName);
	}

}
