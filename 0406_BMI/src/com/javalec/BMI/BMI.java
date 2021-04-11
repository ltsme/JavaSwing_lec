package com.javalec.BMI;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		double weight;
		double BMI;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키를 입력해 주세요 : ");
		height = scanner.nextInt();
		System.out.print("몸무게를 입력해 주세요 : ");
		weight = scanner.nextInt();
		
		BMI = weight/((height/100)*(height/100));
		
		if(BMI < 18.5) System.out.println("저체중 입니다.");
		if (BMI >= 18.5 && BMI < 23) System.out.println("정상 입니다.");
		if (BMI >= 23 && BMI < 25) System.out.println("과체중 입니다.");
		if (BMI >= 25 && BMI <= 30) System.out.println("비만 입니다.");
		if (BMI > 30) System.out.println("고도비만 입니다.");
		
	}

}
