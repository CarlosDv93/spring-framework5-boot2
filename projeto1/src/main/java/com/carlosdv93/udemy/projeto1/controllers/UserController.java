package com.carlosdv93.udemy.projeto1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carlosdv93.udemy.projeto1.repository.UserRepository;

@Controller
public class UserController {

	private UserRepository userRp;
	
	public UserController(UserRepository userRepository) {
		this.userRp = userRepository;
	}
	
	@RequestMapping(value="/users")
	public String getUsers(Model model) {
		model.addAttribute("usersList", this.userRp.findAll());
		
		return "user";
	}
	
}
