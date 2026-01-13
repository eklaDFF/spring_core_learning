package com.ekla.learning;

public class User {

	private String name;

	public User(String name){
		this.name = name;
		System.out.println("User created.");
	}

	public String getName(){
		return this.name;
	}
}