package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] score = new int[10];
		int[] histo = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<histo.length; i++) {
			histo[i] = 0;
		}
		
		System.out.println("Input Score"); // 1단계 
		
		for(int i=0; i<10; i++) {
			System.out.print((i+1) + "의 score :"); // 2단계 
			score[i] = sc.nextInt();
			histo[score[i] / 10]++; // 배열의 인자로 계산식(score[i]/10 ; 0~9를 받는다.)
		}
		
		
		System.out.println("----------Histogram----------"); // 3단계 (히스토그램; 빈도수)
		
		
		for(int i=9; i>=0; i--) {
//			System.out.print(i+"0 : "); // 출력 부분
			System.out.println(String.format("%3d : ", i*10));
			
			for(int j=1; j<=histo[i]; j++) { // 숫자를 #로 바꾸기 
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
