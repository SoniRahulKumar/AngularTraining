package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfExpressionTest {

	SumOfExpression sumOfExpression = new SumOfExpression();   
	
	@Test
	public void addNumTest() {
		
		String exp = "2+3+4";
		int actual = sumOfExpression.addNum(exp);
		int expexted = 9;
		
		assertEquals(actual, expexted);
	}
	
	@Test
	public void addNumNgTest() {
		
		String exp = "2+3+4+3";
		int actual = sumOfExpression.addNum(exp);
		int expexted = 9;
		
		assertEquals(actual, expexted);
	}
}
