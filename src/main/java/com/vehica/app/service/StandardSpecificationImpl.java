package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.repository.StandardSpecificationRepo;

@Service
public class StandardSpecificationImpl implements StandardSpecificationService {

	@Autowired
	private StandardSpecificationRepo standardSpecificationRepo;

	@Override
	public List<String> getAllStdSpec() {
		// TODO Auto-generated method stub
		return standardSpecificationRepo.findByStdSpecNames();
	}
}
