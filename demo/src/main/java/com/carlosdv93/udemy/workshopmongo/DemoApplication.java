package com.carlosdv93.udemy.workshopmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		VehicleComponent component = (VehicleComponent) ctx.getBean("vehicleComponent");
		
		component.service();
	}

}

