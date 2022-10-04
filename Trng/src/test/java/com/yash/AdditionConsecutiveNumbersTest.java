package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionConsecutiveNumbersTest {
	
	private AdditionConsecutiveNumbers AdditionConsecutiveNumbersTest = new AdditionConsecutiveNumbers();
	
	//possitive test case
	@Test
	public void addNumber() {
		
		int actual = AdditionConsecutiveNumbersTest.addNumber();
		int expected= 55;
		
		assertEquals(expected, actual);
		
	}
	
	//negative test case
		@Test 
		public void addNumberNegative() {
			
			int actual = AdditionConsecutiveNumbersTest.addNumber();
			int expected= 60;
			
			assertEquals(expected, actual);
			
		}

}
