package com.vehica.app.service;

import java.util.List;



public interface SegmentService {

	public List<String> getAllSegments();
	public long getSegmentsIdByName(String name);
	public List<String> getRespectiveManufc(long segId);
	
}
