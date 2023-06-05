package com.java.array;

public class ReverseArrayWithin {
	public static void main(String[] args) {
		int[] intArray = new int[]{1,2,3,4,5,6};
		reverseArray(intArray);

	}

	public static void reverseArray(int[] array){

		int endIndex= array.length-1;
		int mid=array.length/2;

		for(int startIndex=0;startIndex<mid;startIndex++){
			int temp = array[startIndex];
			array[startIndex] = array[endIndex];
			array[endIndex] =temp;

			endIndex--;
		}


	}
}
