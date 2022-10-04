package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplyNumberTest {
	
	MultiplyNumber multiplyNumber =  new MultiplyNumber();
	
	@Test
	public void testMultiply() {
		Integer i =123;
		Integer multiply = multiplyNumber.multiplyNunbers(i);
		assertEquals(i, multiply);
	}
}
