package com.javalec.function;

import java.util.Scanner;

public class Sum {

	
	Scanner sc = new Scanner(System.in);
	int sum=0;
	String numstr ;
	
	
	public void Sum() {		
	}
	
	public void sumPrint() {
		System.out.print("숫자 입력 : ");
		numstr = sc.next(); 
		
		for(int i=0; i<numstr.length(); i++) {			
			System.out.println(numstr.charAt(i));
			sum += Character.getNumericValue(numstr.charAt(i));
		}
		
		System.out.println(sum);
	}
}
