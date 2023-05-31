package exceptionhandling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1");
		int x = sc.nextInt();

		System.out.println("Enter number2");
		int y = sc.nextInt();

		try {
			System.out.println("Division Result is :: " + x / y);
		}
		catch (Exception e){
			System.out.println("Exception occured and message is " + e.getMessage());
			return;
		}
		finally {
			System.out.println("Coiming in finally");
		}



	}
}
