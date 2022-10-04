package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortElementASE {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(16);
		list.add(3);
		list.add(7);
		list.add(15);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
