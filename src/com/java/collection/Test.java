package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("Pankaj");
		stringList.add("Priyanka");
		stringList.add("ome");


		for(String s:stringList){
			System.out.println(s);
		}
	}
}
