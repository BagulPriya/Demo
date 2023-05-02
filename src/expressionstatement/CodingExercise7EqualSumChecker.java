package expressionstatement;

public class CodingExercise7EqualSumChecker {
	public static void main(String[] args) {
		hasEqualSum(1,-1,0);
	}



	public static boolean hasEqualSum(int first,int second,int third){
		int result=first+second;
		if(result==third){
			System.out.println("true");
			return true;
		}
		return false;
	}
}
