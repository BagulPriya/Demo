package com.java.array;

public class PrintingReverseArray {
	public static void main(String[] args) {
		int[] array= new int[]{2,4,6,8,10};
		for(int i= array.length-1;i>=0;i--){
			System.out.println(array[i]);
		}

	}

}
