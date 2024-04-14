package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example12 {
	public static void main(String[] args) {
		// List<student> ls = (101,shiva)

		List<Student> asList = Arrays.asList(new Student(101, "shiva", 80), new Student(102, "shiva", 68),
				new Student(103, "cheruku", 95));
		
	asList.stream().sorted(Comparator.comparing(Student::getName)
				.thenComparing((stud1,stud2)->{
					if(stud1.getName().equals(stud2.getName())) {
						return Integer.compare(stud1.getMarks(),stud2.getMarks());
					}
					return 0;
				}
			));

		List<Student> collect = asList.stream().sorted(Comparator.comparing(Student::getMarks))
				.collect(Collectors.toList());
		System.out.println(collect);
	}
}
