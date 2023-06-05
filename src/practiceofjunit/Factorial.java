package practiceofjunit;

public class Factorial {
	public static void main(String[] args) {
		getFactorial(5);

	}
	public static int getFactorial(int num){
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println("the output is: "+ fact);
		return fact;
	}
}
