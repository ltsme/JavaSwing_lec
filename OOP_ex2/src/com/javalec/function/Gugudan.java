package com.javalec.function;

import java.util.Scanner;

public class Gugudan {
		
	public int num1 = 0;
	Scanner sc = new Scanner(System.in);
	
	public Gugudan() {
	}	
	
	public void getGugudan(){

		System.out.print("구구단을 출력할 숫자를 입력하세요 :");
		
		this.num1 = sc.nextInt();		
		for(int i=1; i<=9; i++) {
			System.out.println(num1 + " X " + i + " = " + (num1*i));
		}
	}
}
