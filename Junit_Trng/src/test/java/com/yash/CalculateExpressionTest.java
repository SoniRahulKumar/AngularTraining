package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculateExpressionTest {

	CalculateExpression calculateExpression = new CalculateExpression();

	@Test
	public void addNumTest() {

		String exp = "2+3-4/2*5";
		int actual = calculateExpression.calculate(exp);
		int expexted = 17;

		assertEquals(actual, expexted);
	}

	@Test
	public void addNumNgTest() {

		String exp = "2+3-4/2*5";
		int actual = calculateExpression.calculate(exp);
		int expexted = 9;

		assertEquals(actual, expexted);
	}
}
