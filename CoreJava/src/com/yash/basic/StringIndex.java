package com.yash.basic;

import java.util.Iterator;
import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name);
		
		System.out.println("Please Enter Index");
		int index = sc.nextInt();
		System.out.println("you entered index "+index);
		System.out.println("Enter Next String whitch you wants to add");
		String nextName = sc.next();
		char ch =0;
		String newString;
		for (int i = 0; i < args.length; i++) {
			if(index==i) {
				ch = name.charAt(i);
			}else {
				ch = name.charAt(i);
			}

		}
		System.out.println(name+nextName);
		
	}

}
