package com.javalec.base;

import com.javalec.function.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		
		// 1~10까지의 합을 구하고, 그 합이 짝인지 홀인지 판단...
		
		// 두 기능을 두개의 메소드로 분할				
		
		int i=1, j=10;	
		
//		SumEvenOdd SEO = new SumEvenOdd();
//		
//		int sum = SEO.sumCalc(i, j);
//
//		String chk = SEO.evenOdd(sum);

		SumEvenOdd SEO = new SumEvenOdd();
		SEO.sumCalc(i, j);
		SEO.evenOdd();
		
		
		
	}
}
