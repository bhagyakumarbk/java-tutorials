package com.spring.learnings.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example14 {
	public static void main(String[] args) {
//		int num = 20;
//		for (int i = 1; i <= num; i = i + 2) {
//
//			if (!checkPrime(i)) {
//				System.out.println(i);
//			}
//		}
//	}
//
//	public static boolean checkPrime(int num) {
//		if (num <= 1) {
//			return false;
//		}
//		for (int i = 2; i <= Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
		
		List<Integer> asList = Arrays.asList(2,3,5,7,8,9,2,5,7,2);
		// o/p={4,10,14} group the dup elements n sum of the elements
		Map<Integer,Integer> numberDupmap= new HashMap<>();
		
		for (Integer n : asList) {
			numberDupmap.put(n, numberDupmap.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:numberDupmap.entrySet()) {
			int count = 0;
			if(entry.getValue()>1) {
				count=entry.getKey()*entry.getValue();
				System.out.println(count);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
