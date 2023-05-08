package expressionstatement;

public class CodingExercise9AreaCal {
	public static void main(String[] args) {
		System.out.println(area(5.0));


	}

	public static double area(double radius) {
		if (radius < 0) {
			System.out.println("An invalid value");
			return -1;
		}
		double area = radius * radius * Math.PI;
		return area;
	}
	public static double area(double x,double y) {
		if (x < 0 || y < 0) {
			System.out.println("an invalid value");
			return -1;
		}
		double rectangle = x * y;
		return rectangle;
	}
}
