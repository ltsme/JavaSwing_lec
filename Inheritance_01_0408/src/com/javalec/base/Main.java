package com.javalec.base;

import com.javalec.function.DmbCellPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DmbCellPhone의 Instance를 생성.
		
		DmbCellPhone dmbCP = new DmbCellPhone("자바폰","검정", 10);
		
		System.out.println("모델 :" + dmbCP.model);
		System.out.println("색상 :" + dmbCP.color);
		System.out.println("채널 :" + dmbCP.channel);
		
		dmbCP.powerOn();
		dmbCP.bell();
		dmbCP.sendVoice("여보세요");
		dmbCP.receiveVoice("안녕하세요! 저는 홍길동 인데요");
		dmbCP.sendVoice("아! 반갑습니다. 그럼 안녕히~~~");
		dmbCP.turnOnDmb();
		dmbCP.changeChannelDmb(12);
		dmbCP.turnOffDmb();
		
	}

}
