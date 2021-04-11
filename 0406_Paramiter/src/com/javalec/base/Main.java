package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int paramiter = 0;
		int numbers = 0;
		int cnt = 0;
		
		System.out.println("몇 단계의 파라미드로 구성할까 ? : ");
		paramiter = sc.nextInt();
		

		for(int i=1; i<=paramiter; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print((i) + " ");
			}
			cnt++;
			System.out.println();
		}
	}

}
