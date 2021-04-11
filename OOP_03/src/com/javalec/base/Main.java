package com.javalec.base;

import com.javalec.function.AddNum; // AddNum 이 들어있는 패키지 import

public class Main {

	public static void main(String[] args) {

		int num1 = 10, num2 = 20;		
		AddNum addNum = new AddNum();
		
		// 메소드의 파라미터로 넘겨주기
		String resultNum = addNum.addAction(num1, num2);
		System.out.println(resultNum);
	
		// 메소드의 파라미터로 넘겨주기
		addNum.addPrint(num1, num2);
		
		//constructor로 호출 (매개변수)
		AddNum addNum2 = new AddNum(num1, num2);
		int resultNum2 = addNum2.addAction2();
		System.out.println(resultNum2);
	
		//Field 값으로 호출	
		addNum.num1 = num1;
		addNum2.num2 = num2;
		int resultNum3 = addNum.addAction2();
		System.out.println(resultNum3);
	}

}
