package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.LoginRepository;
import com.model.Login;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public Login getLoginByEmail(Login login) {
		
		return loginRepository.findByEmail(login);
	}

	
}
