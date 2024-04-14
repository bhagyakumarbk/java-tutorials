package com.spring.learnings.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Example10 {
	public static void main(String[] args) {
//		//int[] arr2 = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
//		int[] arr = { 8,0,3,9,6,2,1,0,5};
//
//		int n = arr.length;
//		int[] leftMax = new int[n];
//		int[] rightMax = new int[n];
//		leftMax[0] = arr[0];
//		for (int i = 1; i < n; i++) {
//			leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
//		}
//		rightMax[n - 1] = arr[n - 1];
//		for (int i = n - 2; i >= 0; i--) {
//			rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
//		}
//		int water = 0;
//		for (int i = 0; i < n; i++) {
//
//			water = water + Math.min(leftMax[i], rightMax[i]) - arr[i];
//			// System.out.println(water);
//		}
//		System.out.println(water);

		List<String> strs = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
//		Map<String, List<String>> group = new HashMap<>();

		Map<String, List<String>> collect = strs.stream().collect(Collectors.groupingBy(Example10::sortcharacters));
		List<List<String>> list= new ArrayList<>();
		for (Entry<String, List<String>> entry : collect.entrySet()) {
			list.add(entry.getValue());
		}
		System.out.println(list);

	}

	static String sortcharacters(String w) {
		char[] charArray = w.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}
