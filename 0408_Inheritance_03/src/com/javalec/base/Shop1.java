package com.javalec.base;

public class Shop1 extends StoreHQ {
	
	public Shop1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void orderKim() {
		// TODO Auto-generated method stub
		System.out.println("김치찌개 : 4,500원");
	}
	
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 판매하지 않습니다.");
	}
	
}