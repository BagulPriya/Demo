package com.java.collection;

public class Animal {
	//properties instance variable
	private String name;
	private String breed;
	private int age;

	public Animal(String name, String breed, int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}

	@Override
	public String toString() {
		return "Animal {" +
				"name='" + name + '\'' +
				", breed='" + breed + '\'' +
				'}';
	}
}
