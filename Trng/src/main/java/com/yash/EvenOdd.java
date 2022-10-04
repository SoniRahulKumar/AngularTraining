package com.yash;

public class EvenOdd {

	public String evenOdd(int n) {

		int even_count = 0;
		int odd_count = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0)
				even_count++;
			else
				odd_count++;
			n = n / 10;
		}
		return "Even count : " + even_count + " Odd count : " + odd_count;
	}

	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		String result = evenOdd.evenOdd(1246423456);
		System.out.println(result);
	}
}
