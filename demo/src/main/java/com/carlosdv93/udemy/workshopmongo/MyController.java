package com.carlosdv93.udemy.workshopmongo;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		
		System.out.println("Entrei nesse método");
		
		return "Hello";
	}

}
