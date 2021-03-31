package com.javalec.base;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// if문,switch
		
		
		
		// 선언문
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String result = ""; // 처리 결과 저장
		
		
		// 처리
		
		System.out.println("숫자를 입력하세요!");
		inputNumber = scanner.nextInt();
		
//		if(inputNumber % 2 == 0) { // 짝수 판
//			result = "짝수";
//		}else { // 홀수 판단
//			result = "홀수";
//		}
		
		switch(inputNumber % 2) {
		case 0:
			result = "짝수"; 
			break;
		case 1:
			result = "홀수"; 
			break;
		default:
			break;
			
		}
			
		/*
		 * 2021.03.31 양현준
		 * 기능 : 결과보여주기
		 */
		
		// 결과 보여주기
		System.out.println("입력하신 숫자는 " + inputNumber + "이며" + result + " 입니다.");
		
		
		/*
		 * 반드시 위와 같이 선언부 / 처리부 / 결과부 따로 구역화 하기 
		 */
	}
}
