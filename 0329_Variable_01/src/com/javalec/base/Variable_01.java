package com.javalec.base;

public class Variable_01 {
	
	public static void main(String[] args) {
		// 변수 (Variable)

		// 문자열 변수 선언
		String str = "Hello World!"; // " = " 는 할당 연산자 이다.
		System.out.println(str); // "Hello World!" 출력
		
		str = "New";
		System.out.println(str); // "New" 출력 
		
		// 정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusNum; // 변수 이름은 결과를 알 수 있게 잘 정한다. (좋은 예시 : camel 기법)
					 // 선언은 위에서 해주는 습관을 들이자. ( 선언 - 처리 - 출력 순서)
		
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2); // 정수형 이므로 0.5 대신 0 출력 
		System.out.println((double)num1 / num2); // 실수형 출력 
		
		System.out.println((double)(num1 / num2)); // 잘못 된 예시  
		
		plusNum = num1 + num2;
		System.out.println(plusNum); // (num1 + num2) 대신 plusNum 변수 사용
				
		
		// ----- Exercise 문제
		int startNum = 30, endNum = 40;
		
		int plusResult;
		int minusResult;
		int asterResult;
		int divResult;
		double divResultDouble;
		
		plusResult = startNum + endNum;
		minusResult = startNum - endNum;
		asterResult = startNum * endNum;
		divResult = startNum / endNum;		
		divResultDouble = ((double)startNum / (double)endNum);
		
		System.out.println(startNum + "과 " + endNum + "의 " + "덧셈 결과는 " + plusResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 " + "뺼셈 결과는 " + minusResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 " + "곱셈 결과는 " + asterResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 " + "나눗셈 중 몫은 " + divResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 " + "나눗셈 결과는 " + divResultDouble + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 " + "덧셈 결과와 뺄셈 결과의 곱은 " + (plusResult * minusResult) + " 입니다.");
		
	}
}
