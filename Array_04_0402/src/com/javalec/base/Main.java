package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int heightValue[] = new int[name.length];
		int heightMax = 0;
		int heightMin = 500;
		int total = 0;
		double avg = 0.0;
		int indexMax = 0;
		int indexMin = 0;
		
		
		//	값 입력 받기
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요! : ");
			heightValue[i] = sc.nextInt();
		}
		
				
		
		// Total, Average 구하기 
		for(int i=0; i<name.length; i++) {	
			
			if(heightMax < heightValue[i]) {
				heightMax = heightValue[i];
				indexMax = i;
				
			} else if (heightMin > heightValue[i]) {
				heightMin = heightValue[i];
				indexMin = i;
			}	
			
			total += heightValue[i];
			
		}
		avg = (double)total / heightValue.length;
		
		
		//	결과 출력하기
		System.out.println("평균 신장은 : " +String.format("%.2f", avg));
		System.out.println("가장 큰 학생은 " + name[indexMax] + " 이고 그 학생의 키는 " + heightMax);
		System.out.println("가장 작은 학생은 " + name[indexMin] + " 이고 그 학생의 키는 " + heightMin);
		
	}
}
