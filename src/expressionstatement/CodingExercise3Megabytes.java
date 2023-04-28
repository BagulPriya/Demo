package expressionstatement;

import java.util.Scanner;

public class CodingExercise3Megabytes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number :");
		int kiloBytes = sc.nextInt();
		printMegaBytesAndKiloBytes(kiloBytes);

	}
		public static void printMegaBytesAndKiloBytes ( int kiloBytes){

			if (kiloBytes < 0) {
				System.out.println("Invalid output");
			} else {
				System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB and " + kiloBytes % 1024 + " KB ");
			}

		}
}
