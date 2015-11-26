package com.ddba.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ddba.model.Login;

@Repository
public class LoginRepo {

	private List<Login> logins= new ArrayList<>(Arrays.asList(new Login("admin","admin")));

	public List<Login> getLogin() {
		return logins;
	}
	
}
