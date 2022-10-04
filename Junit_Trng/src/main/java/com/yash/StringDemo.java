package com.yash;

public class StringDemo {

	String name = "yash";

	// charAt, concat, contains, endsWith, equals, equalsIgnoreCase, indexOf,
	// intern, lastIndexOf,
	// length, replace, split, substring, toLowerCase, toUpperCase,trim, valueOf

	public Character charAt(int i) {
		String name = "yash";
		char ch = name.charAt(2);
		return ch;
	}

	public String toUpperCase(String name) {

		return name.toUpperCase();
	}

	public String toLowerCase(String name) {
		// TODO Auto-generated method stub
		return name.toLowerCase();
	}

	public boolean equals(String name) {
		// TODO Auto-generated method stub
		return name.equals("Yash");
	}

	public String concat(String c) {

		return name + " " + c;
	}

	public boolean endWith(String name) {
		// TODO Auto-generated method stub
		return name.endsWith("sh");
	}

}
