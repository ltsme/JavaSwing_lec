package com.javalec.function;

import java.util.Scanner;

public class SumInt {
	
	public int sum = 0;
	Scanner sc = new Scanner(System.in);
	
	
	public SumInt() {
		
	}
	
	public void getSum () {
		System.out.print("Enter an integer(0~9) : " );		
		
		
		for(int i=sc.nextInt(); i!= 0; i/=10) {
	
			this.sum = this.sum + (i%10);	
		}
		
		System.out.println(sum);
	}

	
}
