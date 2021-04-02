package com.javalec.base;

import java.util.Scanner;

public class Main_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 10;
		long value = 1;
		
		
		// 입력 받기
		System.out.print("10 제곱승을 몇 까지 구할까요? : ");
		max = sc.nextInt();
		
		
		// 계산 하며 출력하기
		for(int i=0; i<=max;i++) 
		{
			for(int j=0; j<i;j++) 
			{
				value *= 10; // 횟수 만큼 10 곱하기
			}			
			System.out.println("10^ " + String.format("%2d", i) + " = " + String.format("%20d", value));
			value = 1; // value값 초기화 
		}	
		
	}
}