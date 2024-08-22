package com.ict.day17;

public class Ex12_Main {
	public static void main(String[] args) {
		Ex12_Calculator calculator = new Ex12_Calculator();
		
		Ex12_User1 user1 = new Ex12_User1();
		user1.setCalculator(calculator);
		user1.start();
		
		Ex12_User2 user2 = new Ex12_User2();
		user2.setCalculator(calculator);
		user2.start();
		
		
	}
}
