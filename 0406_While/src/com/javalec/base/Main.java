package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1에서 100까지의 합을 구하
		int tot = 0;
		
//		for(int i=1; i<=100; i++) {
//			
//		}
		
		int i = 1;
		
//		while(i <= 100) {
//			tot +=i;
//			i++;
//		}
//		
//		while(true) {
//			tot += i;
//			i++;
//			if(i > 100) break; // >=이 아닌 > 임에 유
//		}
//		System.out.println(tot);
		
		while(true) {
			if(i % 2 ==1) {
				System.out.println(i);
			}else {
				continue; // break은 가장 가까운 반복문(While)을 빠져나가고, continue는 가장 가까운 반복문의 처음으로 돌아간다.
			}
			i++; // continue 때문에 여기 코드까지 실행하지 못한..
			
			if(i>10) {
				break;
			}
		}
	}

}
