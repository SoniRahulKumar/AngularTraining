package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfIntegerTest {
	
	SumOfInteger sumOfInteger = new SumOfInteger();
	

	@Test
	public void sumOfIntTest() {
		
		int actual = sumOfInteger.sumOfInt();
		int expected = 2107;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void sumOfIntNgTest() {
		
		int actual = sumOfInteger.sumOfInt();
		int expected = 1;
		
		assertEquals(actual, expected);
	}
	
}
