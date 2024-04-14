package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
//		int arr[] = {1,5,7,9,2,3};
		List<Integer> asList = Arrays.asList(1, 5, 7, 9, 2, 3);
		Optional<Integer> findFirst = asList.stream().sorted().skip(asList.size()-3).findFirst();
		System.out.println(findFirst.get());

		String s = "cherukushivakumar";
		Map<Character, Long> collect = s.chars().mapToObj(ch -> (char) ch)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(collect);
	}

}
