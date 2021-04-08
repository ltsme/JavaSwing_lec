package com.javalec.base;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		// 선언
		Scanner scanner = new Scanner(System.in);
		
		int score = 0;
		String grade = "";
		
		
		
		// 처리
		System.out.print("성적을 입력하세요 : ");
		score = scanner.nextInt();
		
		switch(score/10) {
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
		System.out.println("당신의 학점은 " + grade + "등급 입니다.");		
		
	}
}
