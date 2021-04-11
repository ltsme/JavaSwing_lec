package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LunchMenu c1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.AMOND);
		LunchMenu c2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.AMOND);
		LunchMenu c3 = new Child3(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.AMOND);
		
		System.out.println("Child1의 식대 : " + c1.calc());
		System.out.println("Child2의 식대 : " + c2.calc());
		System.out.println("Child3의 식대 : " + c3.calc());
	
	}

}
