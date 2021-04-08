package com.javalec.base;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] moneyLeft = {0,0,0,0,0};
		int checker = 0;
		int end = 0;
		int index = 0;
		int value = 0;
		
		
		while(end == 0) {										// end가 1일 경우, 프로그램 순환 종료 
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.현황");
			System.out.println("4.종료");			
			System.out.print("번호를 선택하세요! : ");
			checker = sc.nextInt();
			
			switch (checker) {
			case 1:
				System.out.print("고객번호 : ");
				index = sc.nextInt();
				System.out.print("금액 : ");
				value = sc.nextInt();
				
				if(index>=1 && index<=5) {						// # 에러처리 1 : 고객 번호를 잘못 입력했을 경우 (0~4)
					moneyLeft[index-1] += value;
					System.out.println("입금 결과 : 고객번호 :" + index + " 잔액 : " + moneyLeft[index-1]);
					System.out.println("------------------------------------------");	
				}else {
					System.out.println("경고! 고객번호를 잘못 입력하셨습니다. 처음으로 돌아갑니다.");
					System.out.println("------------------------------------------");
				}
				break;
				
			case 2:		
				System.out.println();
				System.out.print("고객번호 : ");
				index = sc.nextInt();
				System.out.print("금액 : ");
				value = sc.nextInt();
				
				if(index>=1 && index<=5) {						// # 에러처리 1 : 고객 번호를 잘못 입력했을 경우 (0~4){
					if((moneyLeft[index-1]-value) >0) {			// 에러처리 2 : 출금액이 잔액보다 많을경우 
						moneyLeft[index-1] -= value;
						System.out.println("입금 결과 : 고객번호 :" + index + " 잔액 : " + moneyLeft[index-1]);
						System.out.println("------------------------------------------");	
					} else{
						System.out.println();
						System.out.println("경고! 출금금액이 잔액보다 많습니다. 처음으로 돌아갑니다.");
						System.out.println("------------------------------------------");
					}					
				} else{
					System.out.println("경고! 고객번호를 잘못 입력하셨습니다. 처음으로 돌아갑니다.");
					System.out.println("------------------------------------------");
				}
				break;
				
			case 3:		
				System.out.println("        고객명    잔액");
				System.out.println("        ----    ---");
				for(int i=0; i<5; i++) {					
					System.out.println("          " + (i+1) + "      " + moneyLeft[i]);					
				}
				System.out.println("------------------------------------------");			
				break;
				
			case 4:		
				System.out.println(">>>>> Thank you <<<<<");
				end = 1;											// 프로그램 종료 
				
			default:
				break;
			}			
		}	
	}
}
