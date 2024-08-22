package com.ict.day17;

public class Ex12_User1 extends Thread{
	private Ex12_Calculator calculator;
	
	public void setCalculator(Ex12_Calculator calculator) {
		// Thread 스레드 이름지정
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
