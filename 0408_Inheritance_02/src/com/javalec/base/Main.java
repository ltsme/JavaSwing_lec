package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ParentsMenu parentsMenu = new ParentsMenu();
		parentsMenu.makeChung();
		
		ChildMenu childMenu = new ChildMenu();
		childMenu.makeChung(); // @override	된 메소드
	}

}
