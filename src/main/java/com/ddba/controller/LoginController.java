package com.ddba.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ddba.model.Login;
import com.ddba.service.LoginService;

@RestController
public class LoginController {

	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	@ResponseBody
	public List<Login> display(){
		return loginService.findAll();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void addLogin(@RequestBody Login login){
		loginService.addLogin(login);
	}
//	
}

