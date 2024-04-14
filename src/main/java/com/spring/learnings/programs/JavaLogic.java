package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaLogic {
	//1,2,2,4,3,4
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,2,4,3,4);	
		Map<Integer, Long> stringFreq = list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting()));
		Stream<Entry<Integer, Long>> filter = stringFreq.entrySet().stream().filter(x->x.getValue()>1);
		filter.forEach(x->System.out.println(x.getKey()));
	}
}
