package com.java.array;

public class Main {
	public static void main(String[] args) {
		ArrayServiceInterface arrayServiceInterface = new ArrayServiceImplementation();
		int[] userArray= arrayServiceInterface.getArrayFromUser();
		arrayServiceInterface.printArray(userArray);
		int xyz=arrayServiceInterface.findMinimumFromIntegerArray(userArray);
		System.out.println("Minimum value is " + xyz);
		int abc=arrayServiceInterface.findMaximumFromIntegerArray(userArray);
		System.out.println("Maximum value is " + abc);


	}
}
