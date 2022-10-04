package com.yash.basic;

public class PrimeNumber {

	public static void main(String[] args) {

		primeNumber(5);

	}

	private static void primeNumber(int j) {

		int i, m = 0, flag = 0;
		if (j==0||j==1) {
			System.out.println(j + " Not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (j % i == 0) {
					System.out.println(j + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(j + " is prime number");
			}

		}
	}
}
