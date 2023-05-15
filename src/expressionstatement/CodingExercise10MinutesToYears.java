package expressionstatement;

public class CodingExercise10MinutesToYears {
	public static void main(String[] args) {
		printYearsAndDays(561600);


	}

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0) {
			System.out.println("invalid value");
		} else {
			long year = minutes / 525600;
			long days = (minutes % 525600) / 1440;
			System.out.println(minutes + "min " + " = " + year + " y " + days + " d");
		}
	}
}
