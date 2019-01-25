package com.carlosdv93.udemy.aulas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carlosdv93.udemy.aulas.entity.User;
import com.carlosdv93.udemy.aulas.repositories.UserRepositiry;

@RestController
@RequestMapping(value="/users")
public class UserController {

	@Autowired
	private UserRepositiry userRP;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public List<User> getAllUsers() {
		return userRP.findAll();
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		return userRP.save(user);
	}
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public User editUser(@RequestBody User user) {
		return userRP.save(user);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void findAll(@PathVariable Long id){
        userRP.deleteById(id);
    }

	
	
}
