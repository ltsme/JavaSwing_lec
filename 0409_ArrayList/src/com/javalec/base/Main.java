package com.javalec.base;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
	
	ArrayList<String> arrayList = new ArrayList<String>();
	
	System.out.println("<<<arrayList>>>");
	//arrayList에 데이터 추가
	arrayList.add("str1");
	arrayList.add("str2");
	arrayList.add("str3");
	arrayList.add("str4");
	
	System.out.println(arrayList);
	System.out.println(arrayList.toString());
	
	//arrayList의 데이터 불러오기
	String str1 = arrayList.get(3);
	System.out.println("index 3 : " + str1);
	
	//arrayList의 특정 index의 data를 수정하기
	arrayList.set(1, "str2222");
	System.out.println("");
	
	//arrayList의 크기 확인하기
	int size = arrayList.size();
	System.out.println("Size : " + size);
	
	//arrayList의 내용 삭제하기
	arrayList.remove(1);
	System.out.println(arrayList);
	arrayList.remove("str4");
	System.out.println(arrayList);
	
	//arrayList의 내용 전부 초기화 하기 
	arrayList.clear();
	System.out.println(arrayList);
	
	//arrayList = LinkedList (비슷하다)
	
	System.out.println("<<<Vertor>>>");
	//Vector
	Vector<String> vector = new Vector<String>();
	vector.add("str1");
	vector.add("str2");
	System.out.println(vector);
	}

}
