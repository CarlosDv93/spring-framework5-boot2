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
			createUser("Carlos", "carlos@carlos.com");
			createUser("David", "david@david.com");
			createUser("Maria", "maria@maria.com");
		}
		
		/*User user = userRp.getOne(2l);
		System.out.println(user.getNome());
		user.setNome("David");
		userRp.save(user);
		System.out.println(user);*/
		
		User user = userRp.findByNomeIgnoreCase("maria");
		System.out.println(user.getNome());
		
		User user3 = userRp.findByEmailContaining("rlo");
		System.out.println(user3.getEmail());
		
		User user2 = userRp.findByEmailQualquerCoisa("carlos@carlos.com");
		System.out.println(user2.getEmail() + " " + user2.getNome());
	}
	
	public void createUser(String name, String email) {
		User user = new User(name, email);
		userRp.save(user);
	}

}
