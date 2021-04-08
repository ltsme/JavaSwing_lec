package com.javalec.base;

public class Child3 extends LunchMenu {

	
	public Child3(){
		
	}
	
	public Child3(int rice, int bulgogi, int banana, int milk, int amond) {		
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, amond);
	}	

	@Override
	public int calc() {
		return rice + bulgogi;
	}
	
}
