package com.javalec.base;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int inputIndex = 0;

		
		System.out.print("입력할 숫자의 개수? :");
		number = sc.nextInt();
		int[] nums = new int[100];
		
		
		System.out.println(number + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<number; i++) {
			System.out.print((i+1) +"의 숫자 :");
			nums[i] = sc.nextInt(); 
		}
		
	

		System.out.print("숫자를 삭하고자 하는 위치는 ? :");
		inputIndex = sc.nextInt()-1;
	
		
		for(int i = inputIndex; i<number-1; i++) {
			nums[i] = nums[(i+1)];
		}
		
		System.out.println("------- 결과 -------");
		
		for(int i=0; i<number-1; i++) {
				System.out.println(nums[i]);
		}
		
	}
}
