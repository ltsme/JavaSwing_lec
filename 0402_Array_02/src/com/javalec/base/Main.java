package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputValue = new int[5];
		int total = 0;
		double avg= 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 받아 배열에 넣기
		System.out.println("숫자 5개를 넣으세요 ");
		
		for (int i=0; i<inputValue.length; i++) {
			inputValue[i] = sc.nextInt();
		}		
		
		
		// 입력한 정보의 합계 구하기
		for (int i=0; i<inputValue.length; i++) {
			 total += inputValue[i];
		}
		
		// 입력한 정보의 평균 구하기
		avg = (double)total / inputValue.length;
		
		// 입력한 정보 출력하기
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		System.out.println("----------------------------");
		
		
		for(int i=0; i< inputValue.length; i++) {
			System.out.println(inputValue[i] + "\t");
		}
		
		System.out.println("입력한 정보의 총 합은 " + total + " 입니다.");
		System.out.println("입력한 정보의 평균은 " + String.format("%.2f", avg)  + " 입니다."); // string.format의 이
	
	}

}
