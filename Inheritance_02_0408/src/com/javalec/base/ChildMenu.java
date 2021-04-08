package com.javalec.base;

public class ChildMenu extends ParentsMenu {

	
	//Field
	
	//Constructor
	public ChildMenu() {
		
	}
	
	//Method
	public void makeBeefChung() {
		System.out.println("소고기 청국장");
	}
	
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	
	@Override // @Parents의 메소드를 오버라이드 (라이브러리를 상속받아 쓸 때, 오버라이드를 자주 사용)
	// 상속받은 자식이 부모의 메소드를 다시 정의 하는 것.
	public void makeChung() {
		// TODO Auto-generated method stub
		System.out.println("냄새 없는 청국장");
	}
	
}
