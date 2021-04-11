package com.javalec.base;

public class stringBuilder {
	//String의 문제점을 해결하기 위해 나온 문자열 선언자
	
	public static void main(String[] args) {		
		
		String string = new String("abcdef");
		
		
		StringBuilder sb = new StringBuilder("fedcba");
		sb.append("123123");
		System.out.println(sb);
		
		sb.insert(3,  "zzzz");
		System.out.println(sb);
		
		sb.delete(3, 6);
		System.out.println(sb);
		
		StringBuffer sBuffer = new StringBuffer("fedcba");
		
	
		
	}
	
	
	



}
