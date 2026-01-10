package com.ekla.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);
		ioc.close();
	}
}
