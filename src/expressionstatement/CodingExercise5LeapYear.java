package expressionstatement;

public class CodingExercise5LeapYear {
	public static void main(String[] args) {
		isLeapYear(2000);
	}

	public static boolean isLeapYear(int year) {
		if(year>=1 && year<=9999) {
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println(year + " It is leap Year");
			} else {
				System.out.println(year + " it is not leap year");
			}

		}
		return false;
	}
}
