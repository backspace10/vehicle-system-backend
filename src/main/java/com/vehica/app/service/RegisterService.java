package com.vehica.app.service;

import java.util.List;

import com.vehica.app.model.Register;

public interface RegisterService {

	public String register(Register reg);
	
	public String getUsername(String username);
	public String getPassword(String password);
	public String getUseDetails(String username);
	public String getUseEmail(String username);
	public String getFullName(String username);

}
