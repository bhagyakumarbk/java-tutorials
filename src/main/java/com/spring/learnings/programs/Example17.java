package com.spring.learnings.programs;

public class Example17 {
	public static void main(String[] args) {
		// Input: "abc3d1g1r2v2m2" Output: "abcabcabcdgrrvvmm"
		String s = "abc3d1g1r2v2m2";
//		StringBuilder sb = new StringBuilder();
//		s.chars().forEach(ch -> {
//			if (Character.isDigit(ch)) {
//				char prevChar = sb.charAt(sb.length() - 1);
//				int repeatedCount = Character.getNumericValue(ch);
//				int max = Math.max(0, repeatedCount - 1);
//				sb.append(String.valueOf(prevChar).repeat(max));
//
//			} else {
//				sb.append(ch);
//			}
//		});
//		System.out.println(sb.toString());
	char[] ch= s.toCharArray();
	String req="";
	for (int i = 0; i < ch.length; i++) {
		if(Character.isDigit(ch[i])){
			int count=ch[i];
			while(count!=0) {
				System.out.println(ch[i]);
			for (int j = i-1; !Character.isDigit(ch[i]); j--) {
				req=ch[i]+req;
				System.out.println(req);
				
			}
			count--;
			}
		}
	}
	System.out.println(req);
	}
	
	
}
