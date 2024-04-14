package com.spring.learnings.programs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example5 {
	public static void main(String[] args) {
		String str = "Java";
		Set<Character> s = new HashSet<>();
		List<Character> collect = str.chars().mapToObj(ch -> (char) ch).filter(x -> !s.add(x))
				.collect(Collectors.toList());
		List<Character> collect2 = str.chars().mapToObj(ch -> (char) ch).filter(x ->!collect.contains(x))
				.collect(Collectors.toList());
		System.out.println(collect2);
	}
}
