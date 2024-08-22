package com.ict.day17;

public class Ex06 {
	// 스레드(일꾼) : 현재 실행 중인 프로그램 내에서 실행되는 세부 작업 단위
	// 싱글 스레드 : 스레드가 하나, 즉 일꾼이 하나 
	// 멀티 스레드 : 스레드가 여러개, 즉, 일꾼이 여러개, 병행처리
	// 자바에서 스레드 생성(일꾼 생성)  : start() -> run()
	
	// 스레드 생성 방법
	// 1. Thread 클래스 상속 받기 : start(), run() 둘 다 있다.
	// 2. Runnable 인터페이스 상속 받기 : run()만 존재한다.
	
	// Thread 클래스 가지고 생성하기 
	//  1. Thread(),  2.Thread(Runnable 인터페이스를 상속받은 객체)
	//  3. Thread(스레드이름),  3.Thread(Runnable 인터페이스를 상속받은 객체, 스레드이름)
	
	public void sound() {
		System.out.println("2 : " + Thread.currentThread().getName());
	}
	
	public void start() {
		System.out.println("4 : " + Thread.currentThread().getName());
	}
	
	public void run() {
		System.out.println("6 : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// 현재 실행 중인 스레드 이름 구하기 
		System.out.println("1 : " + Thread.currentThread().getName());
		
		Ex06 test = new Ex06();
		test.sound();
		System.out.println("3 : " + Thread.currentThread().getName());
		
		test.start();
		System.out.println("5 : " + Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
	}
}






