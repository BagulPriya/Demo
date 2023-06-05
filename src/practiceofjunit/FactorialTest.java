package practiceofjunit;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

	@Test
	public void getFactorial() {
		//Factorial fact=new Factorial();
		assertEquals(120,Factorial.getFactorial(5));
	}
}