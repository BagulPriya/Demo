package PracticeArrayALLLSet;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] UserArray= getArray();
		printArray(UserArray);
		System.out.println("Max array is :" + findMaxFromArray(UserArray));
		System.out.println("Min array is :" + findMinFromArray(UserArray));

	}
	public static int[] getArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num=sc.nextInt();
		int[] intArray=new int[num];
		System.out.println("Enter values: ");
		for(int i=0;i<num;i++) {
			intArray[i] = sc.nextInt();
		}

		return intArray;
	}

	public static int findMaxFromArray(int[] intArray){
       int max=0;
	   for(int i=0;i<intArray.length;i++){
		if(i==0){
			max=intArray[i];
		} else if (intArray[i]>max){
			max=intArray[i];
		}
	   }
		return max;
	}

	public static int findMinFromArray(int [] intArray){
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

	public static void printArray(int[] intArray) {
		for(int i=0;i<intArray.length;i++){
			System.out.println(intArray[i]);
		}

	}

}
