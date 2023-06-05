package com.java.array;

public class NameArray {
	public static void main(String[] args) {
		String[] namesArray = new String[]{"Pankaj","ana","ava","Priyanka","Rishi"};
		//for (String s : namesArray) {
		//	System.out.println(s);
		//}
		for(int i=0;i< namesArray.length;i++){
			String s = namesArray[i];
			if(s.startsWith("a") || s.startsWith("A")){
			System.out.println("names starts with a is " + s);
			}

		}


	}



	}

