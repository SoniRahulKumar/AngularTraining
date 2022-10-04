package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenOddTest {

	EvenOdd evenOdd = new EvenOdd();
	
	@Test
	public void evenOdd() {
		int input = 1234;
		String expected =  evenOdd.evenOdd(input);
		String actual = "Even count : " + 2 + " Odd count : " + 2;
		
		assertEquals(actual, expected);
		
	}
	
	@Test
	public void evenOddNg() {
		int input = 12345;
		String expected =  evenOdd.evenOdd(input);
		String actual = "Even count : " + 2 + " Odd count : " + 2;
		
		assertEquals(actual, expected);
		
	}
}
