package com.java.array;

public class Practice {
	public static void main(String[] args) {
		String [] StringArray= new String[]{"Pankaj","Ana","Ava","Priya","Rishi"};

//		for(String s:StringArray){
//			if(s.equalsIgnoreCase("Ana")){
//				System.out.println(s);
//			}
//		}
		for(int i=0;i< StringArray.length;i++){
			String s=StringArray[i];
			if(s.equalsIgnoreCase("ana")){
				System.out.println("Name : " + StringArray[i] + " index " + i);
			}
		}
	}
}
