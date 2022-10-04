package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class FactorialTest {

	Factorial factorial = new Factorial(); 
		
	@Test
	public void factorialOfNumber() {
	
		int num= 5;
		int actual = factorial.factorialOfGivenNm(num);
		int expected = 120;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void factorialOfNumberNeg() {
	
		int num= 5;
		int actual = factorial.factorialOfGivenNm(num);
		int expected = 100;
		
		assertEquals(actual, expected);
	}
}
