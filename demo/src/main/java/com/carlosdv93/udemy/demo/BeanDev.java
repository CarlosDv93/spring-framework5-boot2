package com.carlosdv93.udemy.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

public class BeanDev {

	public BeanDev() {
		System.out.println("Config de Dev");
	}

}
