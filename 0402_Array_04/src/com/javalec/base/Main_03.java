package com.javalec.base;

import java.util.Scanner;

public class Main_03 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int maxValue = 0;
		int maxIndex = 0;
		
		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : " );
		do{
			num = sc.nextInt();    // 0 이상만 받도록
		}while(num<=0 || num>100);  // 0이하 또는 100개 이상일 경우, 다시 값을 받는다.
		
		System.out.println(num + "개의 숫자를 입력하세요! ");		
		int value[] = new int[num];
		
		for(int i=0; i<num; i++) {
			value[i] = sc.nextInt();			
			
			if(maxValue < value[i]) {
				maxValue = value[i];
				maxIndex = i;						
			}
			
			if(i==0 && maxValue==0) maxValue = value[0]; // 에러 방지를 위해 (처음 값 초기화)
		}
		
			System.out.println("입력한 숫자중 최대값은 " + maxValue + "이고 " + (maxIndex+1) + "번째 값 입니다.");
	
	}

}
