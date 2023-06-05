package com.java.array;

import java.util.Scanner;

public class ArrayServiceImplementation implements ArrayServiceInterface{
	@Override
	public int findMaximumFromIntegerArray(int[] intArray) {
		int max=0;
		for(int i=0;i<intArray.length;i++){
			if(i==0){
				max=intArray[i];
			} else if (intArray[i]>max) {
				max=intArray[i];
			}
		}
		return max;

	}

	@Override
	public int[] getArrayFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array elements separated by COMMA : ");
		String userInputString = sc.next();
		String[] stringArray = userInputString.split(",");
		int[] intArray = new int[stringArray.length];
		for(int i=0;i<stringArray.length;i++){
			String str=stringArray[i];
			intArray[i]=Integer.parseInt(str);
		}
		return intArray;

	}

	@Override
	public void printArray(int[] intArray) {
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}

	}

	@Override
	public int findMinimumFromIntegerArray(int[] intArray) {
		int min=0;
		for(int i=0;i<intArray.length;i++){
			if(i==0){
				min=intArray[i];
			} else if (intArray[i]<min){
				min=intArray[i];
			}
		}
		return min;
	}


}
