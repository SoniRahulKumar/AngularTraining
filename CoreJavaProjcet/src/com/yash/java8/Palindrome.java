package com.yash.java8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome implements PalindromeInterface {

	public String checkPalindrome(int value) {
		String result = null;

		int r, sum = 0, temp;
		int n = value;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			result = "palindrome number ";
		else
			result = "not palindrome";

		return result;
	}

	public boolean checkPalindromeUsingJava8(int number) {
		return number == IntStream.iterate(number, i -> i / 10).map(n -> n % 10).limit(String.valueOf(number).length())
				.reduce(0, (a, b) -> a = a * 10 + b);
	}

	public String checkPalindrome() {
		String palidrome = null;
		int r, sum = 0, temp;
		int n = 121;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}

		if (temp == sum)
			palidrome = "palindrome number ";
		else
			palidrome = "not palindrome";

		return palidrome;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		// String result = palindrome.checkPalindrome();

		System.out.println("Enter Value ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
	//	String result = palindrome.checkPalindrome(value);
		
		String palidrome = null;
		boolean result = palindrome.checkPalindromeUsingJava8(value);
		
		if (result==true)
			palidrome = "palindrome number ";
		else
			palidrome = "not palindrome";

		System.out.println(palidrome);

	}

}
