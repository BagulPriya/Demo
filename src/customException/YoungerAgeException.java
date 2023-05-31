package customException;

public class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String message){
		super(message);
	}

}
