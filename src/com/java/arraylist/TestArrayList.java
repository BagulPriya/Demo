package com.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {

		List<String> listString = new ArrayList<>();
		//elements are added sequeence
		//sequeence in which eements
		//elements order is maintained
		//duplicates are allowed

		listString.add("Pankaj");
		listString.add("Pankaj");
		listString.add("Priyanka");
		listString.add("Ana");
		listString.add("Ava");
		listString.add("Rishi");
		//multiple null values are allowed
		listString.add(null);
		listString.add(null);

		//how to removelistString.remove(2);

		for(String s : listString){
			if(s.equalsIgnoreCase("Priyanka")){
				listString.remove(s);
				//conccurrent Modification remove
			}
		}
		/*Iterator<String> it = listString.listIterator();
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("Priyanka")){
				it.remove();
			}
		}*/
		//for

	//	System.out.println(listString.get(4));
	//	listString.add(4,"efdsfds");



		System.out.println(listString);

		//how to retrieve




	}
}
