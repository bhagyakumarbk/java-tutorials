package com.spring.learnings.programs;

import java.util.Arrays;

public class Example13 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		int n = arr.length + 1;
		int totalSum = n * (n + 1) / 2;
		int sum = Arrays.stream(arr).sum();
		System.out.println(totalSum - sum);
	}
}
