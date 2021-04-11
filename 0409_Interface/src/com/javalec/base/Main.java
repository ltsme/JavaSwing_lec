package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone aPhone = new APhone();
		SmartPhone bPhone = new BPhone();
		
		SmartPhone[] smartPhone = {aPhone, bPhone};
		
		for(int i=0; i<smartPhone.length; i++) {
			smartPhone[i].callSenderReiceiver();
			smartPhone[i].telMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("-----------------------");
			
		}
		
		
	}

}
