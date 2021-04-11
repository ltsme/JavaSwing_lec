package com.javalec.base;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int checkNum = 0;
		
		
		System.out.println("입력할 숫자의 개수? :");
		number = sc.nextInt();
		int[] nums = new int[number];
		
		
		System.out.println(number + "개의 숫자를 입력하세요!");
		
		for(int i=0; i<number; i++) {
			System.out.print((i+1) +"의 숫자 :");
			nums[i] = sc.nextInt(); 
		}
		
		System.out.println("검색할 숫자는? :");
		checkNum = sc.nextInt();
		
		
		
		
		
		for(int data=0; data<number; data++) {
			if(nums[data] == checkNum) {
				System.out.println(checkNum +"의 위치는 " + (data+1) + "번째 입니다.");
				break;
			}else if (data==(number-1)){
				System.out.println(checkNum + "는 존재하지 않습니다.");
				break;
			}
		}
		
		
	}
}
