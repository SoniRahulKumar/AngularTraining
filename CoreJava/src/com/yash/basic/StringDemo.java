package com.yash.basic;

public class StringDemo {

	public static void main(String[] args) {

		/*
		 * StringBuffer demo1 = new StringBuffer("Hello") ;
		 * System.out.println("1 "+demo1); demo1 = new StringBuffer("Bye");
		 * System.out.println(demo1);
		 */
		StringBuilder demo2= new StringBuilder("Hello");
		System.out.println("1 "+demo2);
		demo2=new StringBuilder("Bye");
		System.out.println("2 "+demo2);
	}

}
