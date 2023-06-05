package com.java.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		//set has unique values
		//duplicates are not allowed
		//only one null is allowed
		//order is not maintained

		Set<String> setOfPeople = new HashSet<>();
		setOfPeople.add("Pankaj");
		setOfPeople.add("Pankaj");
		setOfPeople.add("Priyanka");
		setOfPeople.add("xyz");
		setOfPeople.add("Ava");
		setOfPeople.add("Ana");
		setOfPeople.add("ABC");




		System.out.println(setOfPeople);
		System.out.println(setOfPeople.size());
		System.out.println(setOfPeople.isEmpty());
		setOfPeople.clear();

		for(String s:setOfPeople){
			System.out.println(s);
		}

		Iterator<String> iterator = setOfPeople.iterator();

		System.out.println("============ Iterator Output to Find Ana ==================");

		while(iterator.hasNext()){
			String s= iterator.next();
			if(s.equalsIgnoreCase("Ana")){
				System.out.println(s);
			}
		}
		System.out.println("============ Iterator End to Find Ana ==================");




	}
}
