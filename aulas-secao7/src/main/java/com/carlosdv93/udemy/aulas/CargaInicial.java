package com.carlosdv93.udemy.aulas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.carlosdv93.udemy.aulas.entity.Role;
import com.carlosdv93.udemy.aulas.entity.User;
import com.carlosdv93.udemy.aulas.enums.StatusRole;
import com.carlosdv93.udemy.aulas.repository.RoleRepository;
import com.carlosdv93.udemy.aulas.repository.UserRepository;

@Component
public class CargaInicial implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRP;

	/*
	//Pq foi add no User o CascadeType.PERSIST no @manyToOne não é necessário ter o RP injetado
	@Autowired
	private RoleRepository roleRP;
	*/
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		
		Role role = new Role("Admin", StatusRole.ATIVO);
		/*roleRP.save(role);*/
		
		User user = new User("carlos", "carlos@carlos.com");
		user.setRole(role);
		
		userRP.save(user);
		
		List<User> userR = this.userRP.findAll();
		
		for(User user2 :userR) {
			Role role2 = user2.getRole();
			
			System.out.println(role2.getName());
		}

	}
	


}
