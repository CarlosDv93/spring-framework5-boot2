package com.carlosdv93.udemy.projeto1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosdv93.udemy.projeto1.entity.User;
import com.carlosdv93.udemy.projeto1.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRp;
	
	public List<User> findAll() {
		return userRp.findAll();
	}
	
}
