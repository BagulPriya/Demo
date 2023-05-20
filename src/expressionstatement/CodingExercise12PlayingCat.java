package expressionstatement;

public class CodingExercise12PlayingCat {
	public static void main(String[] args) {
		isCatPlaying(false,35);

	}

	public static boolean isCatPlaying(boolean summer,int temperature){
		if((summer==true)&&(temperature>=25) &&( temperature<=35)){
			return true;
		} else if ((summer==false) && (temperature >= 25) && (temperature<=35)) {
			return true;
		}else {
			System.out.println("false");
			return false;
		}
	}
}

