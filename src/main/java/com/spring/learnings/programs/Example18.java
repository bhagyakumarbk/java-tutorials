package com.spring.learnings.programs;

public class Example18 {
	public static void main(String[] args) {
		try {
			String s = null;
			s.length();
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
