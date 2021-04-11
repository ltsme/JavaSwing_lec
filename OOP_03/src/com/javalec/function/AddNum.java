package com.javalec.function;

public class AddNum {

	// Field 값 (선언)
	public int num1, num2; // [Field 값으로 호출 시], public 붙여준다.
	
	
	//Constructor (생성자 ; 보통 클래스 이름과 동일하게 쓴다.)
	public AddNum() {
		
	}
	
	// 오버로딩 (이름은 같게, 인자만 다르게)
	public AddNum(int num1, int num2) {
		super();
		this.num1 = num1; // 전역 변수 this.num1
		this.num2 = num2; // 전역 변수 this.num2
	}
	
	
	//Method
	public String addAction(int num1, int num2) {
		int addResult = num1 + num2;
		return Integer.toString(addResult);
	} // 메세지를 글자형태로 보내줌 
	
	public void addPrint(int i, int j) {
		System.out.println(i + j);
	}
	
	public int addAction2() {
		int addResult2 = num1 + num2;
		return num1 + num2;
	}
	
}
