package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = array1; // NEW 로 선언하지 않았기 때문에, Call by reference, 따로 값으로 받는게 아닌 array1 참조
		
		array2[0] = 100;
		array2[1] = 200;
		array2[2] = 300;
		array2[3] = 400;
		array2[4] = 500;
		
		for (int i=0; i<array1.length; i++) {
			System.out.print("array1 : " + array1[i] + "/ \t");
			System.out.println("array2 : " + array2[i]);
		}
		
		
		
		
		int[] array3 = new int[array1.length]; // 메모리에 새롭게 만듬
		// array3 = array1; call by reference 복사와 원본 데이터가 같이 바뀐다. -> 위치 값을 준다.
		
		
		for(int i=0; i<array1.length; i++) { // call by value -> 값을 준다.
			array3[i] = array1[i];
		}
	
		
		for(int i=0; i<array1.length; i++) {
			System.out.print("array1 : " + array1[i] + "/ \t");
			System.out.println("array3 : " + array3[i]);
		}
		
		array3[0] = 10;
		array3[1] = 20;
		array3[2] = 30;
		array3[3] = 40;
		array3[4] = 50;
		
		
		
	}

}
