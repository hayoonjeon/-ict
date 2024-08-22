package com.ict.day17;

public class Ex14_Main {
	public static void main(String[] args) {
		Ex14 test = new Ex14();
		
		new Thread(test, "dog").start(); 
		new Thread(test, "cat").start(); 
	}
}
