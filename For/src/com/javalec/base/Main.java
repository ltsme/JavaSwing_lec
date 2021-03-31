package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven = 0;
		int sumOdd = 0;
		int i = 0;
		double factorial = 1;
		Scanner scanner = new Scanner(System.in);
		
		
//		for (int i=1; i<=10; i++) 
//		{
//			System.out.println(i);
//		}
		
		
//		// 1부터 10까지의 합계 구하기
//		for (i=1; i<=10; i++) 
//		{
//			sum += i;			
//		}		
//		System.out.println("1부터 10 까지의 합계는 " + sum + " 입니다.");
		
		
//		// 1부터 100까지의 수 중 짝수의 합을 구하시오 (if 문 사용)
//		for (i=1; i<=100; i++) 
//		{
//			if (i%2 == 0) sumEven += i;
//			else if (i%2 == 1) sumOdd +=i; 
//		}
//		
//		System.out.println("1부터 100까지의 짝수의 합은 : " + sumEven + "입니다.");
//		System.out.println("1부터 100까지의 홀수의 합은 : " + sumOdd + "입니다.");
//		
		
		// 1부터 100까지의 수 중 짝수의 합을 구하시오 (단, if문 없이)
		
//		for (i=0; i<=100; i = i+2) 
//		{
//			sumEven = sumEven + i;
//		}		
//		System.out.println("1부터 100까지의 짝수의 합은 : " + sumEven + "입니다.");
//
		
		System.out.print("Input your decimal no. : ");
		int tmp = scanner.nextInt(); // 받은 값을 임시로 보관한다 
//		
		for(i=tmp; i>=1; i--)  // 받은 값 부터 1씩 빼 간다.
		{
			factorial *= i;
		}
		
		System.out.println(tmp + "'s factorial value = " + factorial);
		
	}
}
