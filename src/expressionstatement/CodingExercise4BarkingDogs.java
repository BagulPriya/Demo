package expressionstatement;



public class CodingExercise4BarkingDogs {
	public static void main(String[] args) {

		shouldWakeUp(true,-1);

		}



	public static void shouldWakeUp(boolean barking, int hour_of_the_day){
		if( hour_of_the_day>=0 && hour_of_the_day<=23 ) {
			if (barking == hour_of_the_day < 8 || hour_of_the_day > 22) {
				System.out.println("true");
			} else {
				System.out.println("Dog is not barking");
			}

		}
		System.out.println("false");

	}
}

