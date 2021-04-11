package com.javalec.function;

import java.util.Scanner;

public class Calc {
	Scanner sc = new Scanner(System.in);
	
	int num;
	int num2 = 0;
	int plusNum, minusNum, multiNum, divNum;
	
	public Calc() {
		
	}
	
	public void getNum() {
		while(num2 ==0) {
			
			System.out.println("첫 번째 숫자를 입력하세요 :");
			num = sc.nextInt();
			System.out.println("두 번째 숫자를 입력하세요 (0 제외):");
			num2 = sc.nextInt();		
		}
		System.out.println(">>>>>> 결과 <<<<<<<");
		
	}
	
	public void plus() {
		plusNum = num + num2;
		System.out.println("덧셈 : " + plusNum);
	}
	public void minus() {
		minusNum = num - num2;
		System.out.println("셈 : " + minusNum);
	}
	public void multi() {
		multiNum = num * num2;
		System.out.println("곰셈 : " + multiNum);
	}
	public void div() {
		divNum = num / num2;
		System.out.println("나눗셈 : " + divNum);
	}
}