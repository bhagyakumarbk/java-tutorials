package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {
	// {10,15,8,49,98,25,98,32,15}
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(10, 15, 8, 49, 98, 25, 98, 32, 15);
		// {"aa","bb","cc","aa"}
		List<Integer> collect = asList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);

		List<String> asList2 = Arrays.asList("aa", "bb", "cc", "aa");
		Map<String, Long> collect2 = asList2.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect2);
	}
}
