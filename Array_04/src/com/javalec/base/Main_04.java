package com.javalec.base;

import java.util.Scanner;

public class Main_04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String[] lecture = {"Korean", "English", "Mathematics"};
		int Key = 0;
		int Korean[] = new int[4];	
		int English[] = new int[4];	
		int Mathematics[] = new int[4];	
		int total[] = new int [4];
		int avg[] = new int [4];
		
		for(Key=0; Key<3; Key++) {
			System.out.println(lecture[Key] +"의 성적을 입력 : " );
			
			for (int i=0; i<4; i++) {
				
				switch (Key) {
				case 0:
					System.out.print("No" +(i+1)+ "의 성적은 :");
					Korean[i]= sc.nextInt(); 
					break;
				case 1:
					System.out.print("No" +(i+1)+ "의 성적은 :");
					English[i]= sc.nextInt(); 
					break;
				case 2:
					System.out.print("No" +(i+1)+ "의 성적은 :");
					Mathematics[i]= sc.nextInt(); 
					break;	
					
				default: break;
				}				   
			}		
		}
		
		//	과목 출력
		System.out.println("\t" + lecture[0] + "\t" + lecture[1] + "\t" + lecture[2] + "\t" + "Total  \t  Average");
		
		// Total, Average 계산 및 전체 출력
		for(int i=0; i<4; i++) {
			total[i] += (Korean[i] + English[i] + Mathematics[i]);
			avg[i] = (total[i]/lecture.length);	
			
			System.out.println("No" +(i+1)+ "\t" + Korean[i] + "\t\t" + English[i] + "\t\t " + Mathematics[i] + "\t\t" + total[i] + "\t\t"+ avg[i]);
		}			
		
	}
}
