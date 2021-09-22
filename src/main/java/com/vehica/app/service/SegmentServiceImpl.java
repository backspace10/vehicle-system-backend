package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.SegmentRepository;

@Service
public class SegmentServiceImpl implements SegmentService {
	@Autowired
	private SegmentRepository segmentRepository;

	@Override
	public List<String> getAllSegments() {

//		return segmentRepository.findBySegmentName(501, 502, 503, 504,505);
		return segmentRepository.findBySegmentName();
	}

	@Override
	public long getSegmentsIdByName(String name) {
		return segmentRepository.findIdByName(name);
	}

	@Override
	public List<String> getRespectiveManufc(long segId) {
		return segmentRepository.getManufacturersBySegId(segId);
	}

	

	

}
