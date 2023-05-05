package expressionstatement;

public class CodingExercise8TeenNumberChecker {
	public static void main(String[] args) {
		hasTeen(23,15,42);
		isTeen(9);


	}
	public static boolean hasTeen(int one,int two,int three){
		if((one>=13 && one<=19) || (two>=13 && two<=19) || (three>=13 && three<=19)){
			System.out.println("teen");
			return true;
		}
		return false;
	}
	public static boolean isTeen(int a){
		return(a>=13 && a<=19);
	}
}

