package com.yash;

public class PrintBinary {

	public String displayBinary(int num) {
		int[] binary = new int[35];
		int id = 0;
		String binaryNum = "";

		while (num > 0) {
			binary[id++] = num % 2;
			num = num / 2;
		}

		for (int i = id - 1; i >= 0; i--) {
			binaryNum += binary[i];
		}

		return binaryNum;
	}

}
