package com.yash.basic;

class Test extends Exception {
}

public class ExcaptionDemo {

	public static void main(String[] args) {

		
		try {
			throw new Test();
		} catch (Exception e) {
			System.out.println("Catch");
		} finally {
			System.out.println("Finaly");
		}

	}
}
