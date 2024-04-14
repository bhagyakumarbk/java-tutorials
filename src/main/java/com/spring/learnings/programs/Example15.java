package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example15 {
	public static void main(String[] args) {
		List<Person> asList = Arrays.asList(new Person(15,"shiva"),new Person(25,"kumar"),new Person(19,"cheruku"));
		Map<String, List<Person>> collect = asList.stream().collect(Collectors.groupingBy(p->(p.getAge()>18)?"major":"minor"));
	System.out.println(collect);
	}
}
