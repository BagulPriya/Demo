package expressionstatement;

import java.util.Scanner;

public class CodingExercise1Positive {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number= sc.nextInt();
		checkNumber(number);

	}


	public static void checkNumber(int number){
		if(number>0){
			System.out.println("Positive");
		} else if (number<0) {
			System.out.println("Negative");
		}else {
			System.out.println("zero");
		}

	}
}
