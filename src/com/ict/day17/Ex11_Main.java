package com.ict.day17;

public class Ex11_Main {
	public static void main(String[] args) {
		Ex11 test = new Ex11();
		
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
	}
}
