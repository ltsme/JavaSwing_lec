package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//		int remainder = 0;
		int sum = 0;
		int num = 0;
		int counter = 1;
//		
//		System.out.print("Enter an integer : ");
//		int inputValue = sc.nextInt();
//		
//		while(inputValue != 0) {
//			remainder = inputValue % 10;
//			sum += remainder;
//			inputValue = inputValue / 10;
//		}
//		System.out.println(sum);
		
		System.out.println("몇 개의 숫자를 더할까요 ? : ");
		num = sc.nextInt();
		System.out.println(num + " 개의 숫자를 입력하세요 : ");
		while(counter<=num) {
			sum += sc.nextInt();
			counter++;
		}
		System.out.println("입력한 숫자의 합은 " + sum + " 입니다.");
	
	}

}
