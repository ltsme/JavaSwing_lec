package com.javalec.base;

import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan = 0; 
		int integer = 0;
		int sum =0;
		
//		구구단 만들기
//		for(int i=1; i<=9; i++ ) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " X " + j + " = " + i*j);
//			}
//			
//		}		
		
		
//		Exercise
//      원하시는 단을 입력하세요 : 7
//		7 X 2 = 14
//		7 X 4 = 28 
//		.	
//		.
		
		
		
//		
//		//Exercise2
//		//짝수 결과만 나오는 구구단 출력하기
//		System.out.print("구구단을 입력해 주세요 : ");
//		dan = sc.nextInt();
//			
//		for(int i=1; i<=9; i++) {
//			
//			switch(i%2) {
//				case 0 : System.out.println(dan + " X " + i + " = " + dan*i);
//				break;
//					
//				case 1 : System.out.println(dan + " X " + " " + " = " + dan*i);
//				break;
//			}		
//		}
		
		
		
//		//exercise3
//		enter an integer(0~9) : 12345678
//		Sum of digits = 36
		
		System.out.print("enter an integer(0~9) : ");		
		int remain = 0; 
		
		for(integer = sc.nextInt(); integer != 0; integer/=10) {
			System.out.println(integer);
			remain = remain + (integer%10);				
		}		
		
		System.out.println(remain);
		
		
	}
}
