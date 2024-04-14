package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> l2 = Arrays.asList(5, 6, 7, 8, 9, 10);

		List<Integer> l3 = l1.stream().filter(l2::contains).collect(Collectors.toList());
		System.out.println(l3);
	}

}
