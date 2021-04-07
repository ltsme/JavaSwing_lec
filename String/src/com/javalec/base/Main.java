package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		
		String str1 = new String("Hello"); // 원래는 이렇게 선언해야 하지만, 위처럼 사용 가능 
		
		Scanner scanner = new Scanner(System.in);
		
		
		String str3 = "abcdefg";
		String str4 = " abc def gh";
		
//		System.out.println(str3.concat(str4));
//		System.out.println(str3.substring(3));
//		System.out.println(str3.substring(3, 5));
//		System.out.println(str3.length());
//		System.out.println(str3.toUpperCase());
//		System.out.println(str3.toLowerCase());
//		System.out.println(str3.charAt(1));
		
		for(int i=0; i<str3.length(); i++) {
			System.out.println(str3.charAt(i));
		}
		
		System.out.println(str3.indexOf("c"));
		System.out.println(str3.equals(str4));
		System.out.println(str4.trim()); //앞,뒤 space 제거 
		
		System.out.println(str3.replace('a', 'z'));
		System.out.println(str3);
		System.out.println(str3.replaceAll(str3, "zzzzzzzz"));
	}

}
