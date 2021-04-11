package com.javalec.base;

public class Child2 extends LunchMenu {

	public Child2() {
		// TODO Auto-generated constructor stub
	}
	
	public Child2(int rice, int bulgogi, int banana, int milk, int amond) {		
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, amond);
	}
	
	
	@Override
	public int calc() {
		return rice + bulgogi + milk + amond;
	}	
}

