package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 선언
		
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = "";
		
		
		// 처리
		
		do {
			System.out.print("성적을 입력해 주세요 (0~100) : ");
			score = scanner.nextInt();	
		} while(score < 0 || score > 100);  // 음수 또는 100점 초과 입력 시, 다시 입력을 받는다.
		
		
			switch(score/10) { // 점수 분별을 위한 switch 사용
			case 10 :
				grade = "A+ ";
				break;
			case 9 :
				grade = "A ";
				break;
			case 8 :
				grade = "B ";
				break;
			case 7 :
				grade = "C ";
				break;
			case 6 :
				grade = "D ";
				break;
			default :
				grade = "F ";
				break;			
			}					
		
				
		// 결과 보여주기		
		System.out.println("----------------------");		
		System.out.println("당신의 학점은 " + grade + "등급 입니다.");		
		System.out.println("----------------------");
		
	}
}
