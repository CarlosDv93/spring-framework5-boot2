package com.carlosdv93.udemy.aulas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.carlosdv93.udemy.aulas.entity.Role;
import com.carlosdv93.udemy.aulas.entity.User;
import com.carlosdv93.udemy.aulas.repository.RoleRepository;
import com.carlosdv93.udemy.aulas.repository.UserRepository;

@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private RoleRepository roleRP;
	
	@Autowired
	private UserRepository userRP;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Role role = new Role();
		
		role.setName("Admin");
		
		Role role2 = new Role();
		role2.setName("Aluno");
		
		roleRP.save(role);
		roleRP.save(role2);
		
		User user = new User();
		user.setNome("Carlos");
		user.setEmail("Carlos@carlos.com");
		user.setRole(role);
		userRP.save(user);
		
		User user2 = new User("David", "david@david.com");
		user2.setRole(role);
		userRP.save(user2);
	}
	
	

}
