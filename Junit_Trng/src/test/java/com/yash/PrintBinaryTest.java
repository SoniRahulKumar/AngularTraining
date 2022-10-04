package com.yash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrintBinaryTest {

	PrintBinary printBinary = new PrintBinary();
	
	@Test
	public void testPrintBinary() {
		int num = 45;
		String actual = printBinary.displayBinary(num);
		String expected = "101101";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPrintBinaryNG() {
		int num = 45;
		String actual = printBinary.displayBinary(num);
		String expected = "1011010";
		
		assertEquals(expected, actual);
	}
}
