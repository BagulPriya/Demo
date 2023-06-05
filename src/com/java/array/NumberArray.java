package com.java.array;

public class NumberArray {
	public static void main(String[] args) {
		int[] intArray=new int[]{1,2,3,20,30};
		for(int i=0;i< intArray.length;i++){
			int A=intArray[i];
			if(A>10){
				System.out.println(A);
			}
		}

	}
}
