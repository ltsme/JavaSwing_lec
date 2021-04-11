package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.AddNum;
import com.javalec.function.DivNum;
import com.javalec.function.MinusNum;
import com.javalec.function.MultiNum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AddNum addNum = new AddNum();
		MinusNum minusNum = new MinusNum();
		MultiNum multiNum = new MultiNum();
		DivNum divNum = new DivNum();
		
		int num1, num2 ;
		String addResult;
		String minusResult;
		String multiResult;
		String divResult;
		
		System.out.println("첫번째 정수");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		addResult = addNum.addAction(num1, num2);
		minusResult = minusNum.minusAction(num1, num2);
		multiResult = multiNum.multiAction(num1, num2);
		divResult = divNum.divAction(num1, num2);
	
		System.out.println(addResult);
		System.out.println(minusResult);
		System.out.println(multiResult);
		System.out.println(divResult);
	
	
	}

}
