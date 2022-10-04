package com.yash;

public class SumOfExpression {

	public int addNum(String exp) {

		String add[] = exp.split("\\+"); 
		
		int sum = 0;
		for (int j = 0; j < add.length; j++) {
			int i =  Integer.parseInt(add[j]);
			sum = sum + i;
		}
		return sum;
		
	}

}
