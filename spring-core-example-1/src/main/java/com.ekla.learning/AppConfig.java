package com.ekla.learning;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {

	@Bean
	public User getUser(){
		return new User("Rahul Kumar");
	}
}