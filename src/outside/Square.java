package outside;

import inside.Shape;

public class Square  extends Shape {
	@Override
	protected void draw(){
		System.out.println("Drawing inside.Shape");
	}

}