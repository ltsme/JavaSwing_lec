package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreHQ storeHQ = new StoreHQ();
		Shop1 shop1 = new Shop1();
		Shop2 shop2 = new Shop2();
		Shop3 shop3 = new Shop3();
		
		
		
		System.out.println("HQ-----------------");
		storeHQ.orderKim();
		storeHQ.orderBu();
		storeHQ.orderBi();
		storeHQ.orderSoon();
		storeHQ.orderKong();
		
		System.out.println("Shop1--------------");
		shop1.orderKim();
		shop1.orderBu();
		shop1.orderBi();
		shop1.orderSoon();
		shop1.orderKong();
		
		System.out.println("Shop2--------------");
		shop2.orderKim();
		shop2.orderBu();
		shop2.orderBi();
		shop2.orderSoon();
		shop2.orderKong();
		
		System.out.println("Shop3--------------");
		shop3.orderKim();
		shop3.orderBu();
		shop3.orderBi();
		shop3.orderSoon();
		shop3.orderKong();
		
		System.out.println("===================");
		StoreHQ[] store = {new StoreHQ(), new Shop1(), new Shop2(), new Shop3()};
		for(int i=0; i<store.length; i++) {
			store[i].orderKim();
			store[i].orderBu();
			store[i].orderBi();
			store[i].orderSoon();
			store[i].orderKong();
		}
	}

}
