package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example9 {
	public static void main(String[] args) {
		Instructor instructor1 = new Instructor("Mike", 10, "Software Developer", "M", true,
				Arrays.asList("Java Programming", "C++ Programming", "Python Programming"));
		Instructor instructor2 = new Instructor("Jenny", 5, "Engineer", "F", false,
				Arrays.asList("Multi-Threaded Programming", "CI/CD", "Unit Testing"));
		Instructor instructor3 = new Instructor("Gene", 6, "Manager", "M", false,
				Arrays.asList("C++ Programming", "C Programming", "React Native"));
		Instructor instructor4 = new Instructor("Anthony", 15, "Senior Developer", "M", true,
				Arrays.asList("Java Programming", "Angular Programming", "React Native"));
		Instructor instructor5 = new Instructor("Syed", 15, "Principal Engineer", "M", true,
				Arrays.asList("Java Programming", "Java Multi-Threaded Programming", "React Native"));
		List<Instructor> asList = Arrays.asList(instructor1, instructor2, instructor3, instructor4, instructor5);
		List<Instructor> collect = asList.stream()
				.filter(x -> x.getYearsOfExperience() > 10).filter(x->x.isOnlineCourses() == true)
				.collect(Collectors.toList());
//		System.out.println(collect);
		
		Map<String, List<Instructor>> collect2 = asList.stream().collect(Collectors.groupingBy(x->x.getYearsOfExperience()>10?"Senior":"Junior"));
		
		System.out.println(collect2);
	}
}
