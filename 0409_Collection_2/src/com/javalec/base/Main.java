package com.javalec.base;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(10, "str0");
		hashMap.put(11, "str1");
		hashMap.put(21, "str2");
		hashMap.put(31, "str3");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.get(hashMap.get(11))); //key값이 Int
		
		HashMap<String, String> hasMap2 = new HashMap<String, String>();
		hasMap2.put("a", "apple");
		hasMap2.put("b", "banana");
		hasMap2.put("c", "coke");
		System.out.println(hasMap2);
		System.out.println(hasMap2.get("c")); // key값이 String
		
		hasMap2.clear();
		
		// 검색 위주 : hashmap
	}
}
