package Junitchallenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {
	private Utilities util;

     @org.junit.Before
	public void setup(){
		util=new Utilities();
	}

	@Test
	public void everyNthChar() throws Exception {

		char[] output=util.everyNthChar(new char[]{'h','e','l','l','o'},2);
		assertArrayEquals(new char[]{'e','l'},output);
		char[] output2=util.everyNthChar(new char[]{'h','e','l','l','o'},8);
		assertArrayEquals(new char[]{'h','e','l','l','o'},output2);

	}

	@Test
	public void removePairs() throws Exception{

		assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
		assertEquals("ABCABDEF",util.removePairs("ABCCABDEEF"));
		assertNull("did not get null returned when argument passed was null",util.removePairs(null));
		assertEquals("A",util.removePairs("A"));
		assertEquals("",util.removePairs(""));
	}

	@Test
	public void converter()throws Exception {

	assertEquals(300,util.converter(10,5));
	}
	@org.junit.Test(expected=ArithmeticException.class)
	public void converter_arithmaticException()throws Exception{
		Utilities util=new Utilities();
		util.converter(10,0);
	}


	@Test
	public void nullIfOddLength()throws Exception {
		assertNull(util.nullIfOddLength("odd"));
		assertNotNull(util.nullIfOddLength("even"));

	}
}