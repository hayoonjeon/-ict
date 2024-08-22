package com.ict.day17;

public class Ex13_Main {
	public static void main(String[] args) {
		Ex13 test = new Ex13();
		
		new Thread(test, "dog").start();
		new Thread(test, "cat").start();
		new Thread(test, "tiger").start();
		new Thread(test, "lion").start();
	}
}
