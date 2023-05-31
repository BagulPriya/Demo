package inside;

public class Circle extends Shape {

	@Override
	public void draw(){
		System.out.println("Drawing circle");
	}

	@Override
	public String toString(){
		return "circle";
	}



}
