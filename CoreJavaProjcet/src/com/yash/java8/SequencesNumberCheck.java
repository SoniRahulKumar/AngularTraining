package com.yash.java8;

import java.util.Scanner;

public class SequencesNumberCheck {

	public static void main(String[] args) {

		System.out.println("Enter number");
		Scanner scanner = new Scanner(System.in);
		//String input = scanner.next();
		String input = "1,2,3,4,6,7,8,11,13,14,15,19,20,21";
		System.out.println(input);
		
		String s[] = input.split(",");
		//int length = s.length;
		for (int i = 0; i < s.length; i++) {
			if(i<=i+1) {
				
			}else {
				System.out.println(i+"-"+);
			}
		}
		
		
	}

}
