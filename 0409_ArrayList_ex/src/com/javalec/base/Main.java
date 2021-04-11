package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=2; i<=100; i+=2) {
			arrayList.add(i);
		}
		
		for(int i=0; i<arrayList.size(); i++) {
			sum += arrayList.get(i);
		}
		System.out.println("합 : " + sum);
		System.out.println(arrayList);
	}

}
