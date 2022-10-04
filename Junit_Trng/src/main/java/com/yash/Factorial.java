package com.yash;

import java.util.Iterator;

public class Factorial {

	public int factorialOfGivenNm(int num) {

		int sum = 1;
		for (int i = 1; i <= num; i++) {
			sum = sum * i;
		}

		return sum;
	}

}
