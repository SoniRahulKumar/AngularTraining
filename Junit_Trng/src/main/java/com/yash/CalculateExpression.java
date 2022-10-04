package com.yash;

public class CalculateExpression {

	public int calculate(String exp) {

		int sum = 0;
		for (int j = 0; j < exp.length(); j++) {
		//	char i = Character.isDigit(exp.charAt(j));
			if(Character.isDigit(exp.charAt(j))==true) {
				int value = exp.charAt(j);
				sum = sum +  value;
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		CalculateExpression calculateExpression = new CalculateExpression();
		int i = calculateExpression.calculate("2+3-4/2*5");
		System.out.println(i);
		
	}

}
