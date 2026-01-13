package com.ekla.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotated_ioc = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(annotated_ioc.getBean(User.class).getName());
	}
}