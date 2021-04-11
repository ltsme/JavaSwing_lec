package com.javalec.calc;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				
//				int num = scanner.nextInt();
//				System.out.println("입력 숫자는 " + num + "입니다");
				
				//Exercise
				
			
//				System.out.print("숫자를 입력해 주세요 : ");
//				int num = scanner.nextInt();
//				System.out.println((num%3)==0 ? "입력하신 숫자는 3의 배수 입니다." : "입력하신 숫자는 3의 배수가 아니다.");
//				
//				scanner.close();
//				
				
				
				
				
				
				// 비교 연산
				
				
				
				
				
//				String grade;
//				System.out.print("성적을 입력하세요 : ");
//				int point = scanner.nextInt(); 
//				
//				switch(point/10) { // 점수를 10으로 나눈 값 (0~10)
//					case 10 : grade = "A"; break;
//					case 9 : grade = "A"; break;
//					case 8 : grade = "B"; break;
//					case 7 : grade = "C"; break;
//					case 6 : grade = "D"; break;
//					case 5 : grade = "E"; break;
//					default : grade = "F"; break;
//				}
//				System.out.println("귀하의 학점은" + grade + "학점 입니다.");
				
				
				
				int korean;
				int english;
				int math;
				float average;
				String averHigh = "평균보다 높습니다.";
				String aver = "평균 점수 입니다.";
				String averLow = "평균보다 낮습니다.";
				
				
				System.out.print("국어 점수를 입력하세요! : ");
				korean = scanner.nextInt(); 
				System.out.print("영어 점수를 입력하세요! : ");
				english= scanner.nextInt(); 
				System.out.print("수학 점수를 입력하세요! : ");
				math = scanner.nextInt(); 
				
				average = (korean+english+math)/3;
				System.out.println("평균 점수는 " + average);
				
				if (korean > average) {
					System.out.print("국어 점수는 " + averHigh);
					} else if (korean < average){
						System.out.println("국어 점수는 " + averLow);
					} else {
						System.out.println("국어 점수는 " + aver);
					}
				
				if (english > average) {
					System.out.println("영어 점수는 " + averHigh);
					} else if (english < average){
						System.out.println("영어 점수는 " + averLow);
					} else {
						System.out.println("영어 점수는 " + aver);
					}
				
				if (math > average) {
					System.out.println("수학 점수는 " + averHigh);
					} else if (math < average){
						System.out.println("수학 점수는 " + averLow);
					} else {
						System.out.println("수학 점수는 " + aver);
					}
				
				
				}
				
				

}
