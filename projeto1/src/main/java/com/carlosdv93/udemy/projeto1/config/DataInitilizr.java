package com.carlosdv93.udemy.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.carlosdv93.udemy.projeto1.entity.User;
import com.carlosdv93.udemy.projeto1.repository.UserRepository;

@Component
public class DataInitilizr implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private UserRepository userRp; 
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Entrou aqui!");
		
		List<User> users = userRp.findAll();
		
		if(users.isEmpty() || users == null) {
			User carlos = new User();
			carlos.setEmail("carlos@carlos.com");
			carlos.setNome("Carlos");
			userRp.save(carlos);
		}
		
	}

}
