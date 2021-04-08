package com.javalec.function;

public class DmbCellPhone extends CellPhone {
	
	
	//Field
	public int channel;
	
	
	//Constructor
	public DmbCellPhone() {
		// 기본 Constructor는 항상 만들어 주는게 좋다.
	} 
	
	public DmbCellPhone(String model, String color, int channel) {
		super(); // 부모클래스의 멤버를 초기화
		this.model = model; // '인스턴스' 변수 앞에 this를 붙여 '지역변수'와 구분
		this.color = color;
		this.channel = channel;		
		// 오버로딩 (Overloading) : 같은 이름의 생성자 생성(Parameter만 다름)
	}
	
	//Method
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송 수신을 시작합니다.");
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	public void turnOffDmb() {
		System.out.println("Dmb 방송 수신을 멈춥니다.");
	}
}
