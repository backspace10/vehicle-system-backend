package com.vehica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehica.app.model.Register;
import com.vehica.app.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public String register(Register reg) {
		registerRepository.save(reg);
		return "User registered sucessfully";
	}

	
	@Override
	public String getUsername(String username) {
		
		// TODO Auto-generated method stub
		return registerRepository.findByUsername(username);
	}

	@Override
	public String getPassword(String password) {
		// TODO Auto-generated method stub
		return registerRepository.findByPassword(password);
	}


	@Override
	public String getUseDetails(String username) {
		// TODO Auto-generated method stub
		return registerRepository.findByUserName(username);
	}


	@Override
	public String getUseEmail(String username) {
		// TODO Auto-generated method stub
		return registerRepository.findMailByUserName(username);
	}


	@Override
	public String getFullName(String username) {
		// TODO Auto-generated method stub
		return registerRepository.findFullName(username);
	}


	
}
