package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class NumberArrayUsingArrayList {
	public static void main(String[] args) {
		List<Integer>number =new ArrayList<>();
		number.add(3);
		number.add(6);
		number.add(9);
		number.add(12);
//		for(int i=0;i< number.size();i++){
//			System.out.println(number.get(i));

//		}
		int j=0;
		for(Integer i:number){
			System.out.println( "Element "+ i + " is at location :"+j);
			j++;
		}
	}
}
