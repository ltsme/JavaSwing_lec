package com.javalec.base;

public class Child1 extends LunchMenu {
	
	
	public Child1() {
		
	}

	public Child1(int rice, int bulgogi, int banana, int milk, int amond) {		
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, amond);
		
	}
	
	
	@Override
	public int calc() {
		return rice + bulgogi + banana;
	}	
	
}
