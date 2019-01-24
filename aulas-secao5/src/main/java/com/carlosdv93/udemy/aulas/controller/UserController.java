package com.carlosdv93.udemy.aulas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosdv93.udemy.aulas.domain.User;

@RestController
public class UserController {

	@RequestMapping(value="/user", method=RequestMethod.GET)
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User carlos = new User("Carlos", "carlos@carlos.com");
		User jose = new User("Jose", "jose@jose.com.br");
		
		users.add(carlos);
		users.add(jose);
		
		return users;
	}
	
	@RequestMapping(value="/user/{name}", method=RequestMethod.GET)
	public List<User> getUserByName(@PathVariable String name){
		List<User> users = new ArrayList<>();
		User user = new User(name, name+"@"+name+".com");
		users.add(user);
		return users;
	}
	
	@RequestMapping(value="user", method=RequestMethod.POST)
	public User setUser( @RequestBody User user) {
		return user;
	}
	
}
