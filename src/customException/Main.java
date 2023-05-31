package customException;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number: ");
		int num=sc.nextInt();
		try{
			if(num<18){
				throw new YoungerAgeException("you are not eligible to vote");
			}
		    else{
				System.out.println("you can vote");
			}
		}catch(YoungerAgeException e){
			e.printStackTrace();

		}
	}
}
