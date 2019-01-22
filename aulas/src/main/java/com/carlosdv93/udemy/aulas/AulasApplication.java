package com.carlosdv93.udemy.aulas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.carlosdv93.udemy.aulas.controller.MyController;

@SpringBootApplication
@ComponentScan(basePackages = {"com.carlosdv93.udemy.aulas.service", "com.carlosdv93.udemy.aulas.controller"})
public class AulasApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AulasApplication.class, args);
		
		MyController controller = (MyController) ctx.getBean("myController");
		
		controller.hello();
	}

}

