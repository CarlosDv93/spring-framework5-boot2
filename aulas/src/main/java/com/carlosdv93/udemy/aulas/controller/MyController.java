package com.carlosdv93.udemy.aulas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String hello() {
		System.out.println("Entrei no método hello do Controller");
		return "olá mundo";
	}
	
}
