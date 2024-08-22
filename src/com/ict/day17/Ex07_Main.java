package com.ict.day17;

public class Ex07_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		Ex07_Dog dog = new Ex07_Dog();
		Ex07_Cat cat = new Ex07_Cat();
		Ex07_Cow cow = new Ex07_Cow();
		
		// 스레드 처리 아님
		// dog.sound();
		// cat.sound();
		// cow.sound();
		// System.out.println("main : " + Thread.currentThread().getName());

		// 스레드 처리 (병행 처리 )
		dog.start();
		cat.start();
		cow.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
		
	}
}
