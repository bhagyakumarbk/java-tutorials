package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;

public class Example7 {
	public static void main(String[] args) {
		// List<String> s = Arrays.asList("shiva","manoj","bayana");
		String s = "bayana";
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			count = count+Math.abs('a' - ch[i] )+1;
			//System.out.println(count);
		}
		System.out.println(count);

	}
}
