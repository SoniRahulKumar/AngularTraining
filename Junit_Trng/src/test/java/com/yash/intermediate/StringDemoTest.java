package com.yash.intermediate;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.yash.intermediate.StringDemo;

public class StringDemoTest {

	// charAt, concat, contains, endsWith, equals, equalsIgnoreCase, indexOf,
	// intern, lastIndexOf,
	// length, replace, split, substring, toLowerCase, toUpperCase,trim, valueOf

	StringDemo stringDemo = new StringDemo();

	String name = "yash";

	@Test
	public void chatAtTest() {

		Character actual = stringDemo.charAt(2);
		char expected = 's';

		assertNotEquals(actual, expected);
	}

	@Test
	public void chatAtTestNg() {

		Character actual = stringDemo.charAt(2);
		char expected = 'a';

		assertNotEquals(actual, expected);
	}

	@Test
	public void concatTest() {

		String addString = "Technologies";
		String actual = stringDemo.concat(addString);
		String expected = name + " " + addString;

		assertNotEquals(actual, expected);
	}

	@Test
	public void concatTestNg() {

		String addString = "Technologies";
		String actual = stringDemo.concat(addString);
		String expected = name + addString;

		assertNotEquals(actual, expected);
	}
	
	@Test
	public void toUpperCaseTest() {

		String actual = stringDemo.toUpperCase(name);
		String expected = "YASH";

		assertNotEquals(actual, expected);
	}
	
	@Test
	public void toUpperCaseTestNg() {

		String actual = stringDemo.toUpperCase(name);
		String expected = "YASH   ";

		assertNotEquals(actual, expected);
	}

	@Test
	public void toLowerCaseTest() {
		String upper = "YASH";
		String actual = stringDemo.toLowerCase(upper);
		String expected = "yash";

		assertNotEquals(actual, expected);
	}
	
	@Test
	public void toLowerCaseTestNg() {
		String upper = "YASH";
		String actual = stringDemo.toLowerCase(upper);
		String expected = "yash Tech";

		assertNotEquals(actual, expected);
	}

	@Test
	public void equalsTest() {

		boolean actual = stringDemo.equals(name);
		boolean expected = true;

		assertNotEquals(actual, expected);
	}
	
	@Test
	public void equalsTestNg() {

		boolean actual = stringDemo.equals(name);
		boolean expected = false;

		assertNotEquals(actual, expected);
	}

	@Test
	public void endWithTest() {

		boolean actual = stringDemo.endWith("sh");
		boolean expected = true;

		assertNotEquals(actual, expected);
	}

	@Test
	public void endWithTestNg() {

		boolean actual = stringDemo.endWith("sh");
		boolean expected = false;

		assertNotEquals(actual, expected);
	}
}
