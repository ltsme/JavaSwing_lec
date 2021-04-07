package com.javalec.base;

import java.util.Random;
import java.util.Scanner;

public class Main2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);		
		Random rand = new Random();			
		int data = 0;
		int randomValue = 0;
		randomValue = rand.nextInt(3);		
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("1: 가위, 2: 바위, 3: 보");

		data = sc.nextInt();
		
		
		if(data ==(randomValue+1)) {
			System.out.println("비겼습니다!");
		} else if(data == 1 && (randomValue+1) == 2 || data == 2 && (randomValue+1) == 3 || data == 3 && (randomValue+1) == 1) {
			System.out.println("이겼습니다!");
		} else if(data == 2 && (randomValue+1) == 1 || data == 3 && (randomValue+1) == 2 || data == 1 && (randomValue+1) == 3) {
			System.out.println("졌습니다!");
		} 
		
		System.out.println("나 : " + data + " 컴퓨터 : "+ (randomValue+1));
		
	}
}
