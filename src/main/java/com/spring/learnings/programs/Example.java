package com.spring.learnings.programs;

public class Example {
	//1,2,3,4,5=2*3*4*5
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int product=1;
		for(int num:arr) {
			product*=num;
		}
		System.out.println(product);
	}
	
	
}
