package com.java.string.reverse;

public class MainStringReverse {
	public static void main(String[] args) {
		String s = "Pankaj";
		char[] charArray = s.toCharArray();
		reverseCharArray(charArray);


	}
	public static void  reverseCharArray(char[] charArray){

		int endIndex = charArray.length-1;
		int mid= charArray.length/2;
		for(int startIndex=0;startIndex<mid;startIndex++){
			char temp= charArray[startIndex];
			charArray[startIndex]=charArray[endIndex-startIndex];
			charArray[endIndex-startIndex]=temp;
		}
		System.out.println(charArray);

	}
}
