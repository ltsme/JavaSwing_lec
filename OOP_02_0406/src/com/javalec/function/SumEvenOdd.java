package com.javalec.function;

public class SumEvenOdd {
	
	// Field, property (초기값)
	int num = 0; // 전역 변수 
	
	
	// constructor (생성자)
	public SumEvenOdd() {		
	}
	
	
	
	// method (함수)
	public void sumCalc(int num1, int num2) {
		int sum = 0;
		for(int i=num1; i<=num2; i++) sum +=i;		
		
		num = sum;
		System.out.println(num1 + " ~ " + num2 + " 의 합은 " + sum + " 입니다.");
	}
	
	
	public void evenOdd() {
		String str = "";
		
		if(num %2 ==1) str = "홀수";
		else if(num %2 ==0) str = "짝수";
		
		System.out.println(str + " 입니다.");	
	}
	
}
