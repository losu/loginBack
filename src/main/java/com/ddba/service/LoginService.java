package com.ddba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddba.model.Login;
import com.ddba.repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo loginRepo;
	
	public List<Login> findAll(){
		return loginRepo.getLogin();
	}

	public void addLogin(Login login) {
		loginRepo.getLogin().add(login);
		
	}
	
	
}
