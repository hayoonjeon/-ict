package com.ict.day17;

// 스레드 만들어서 실행하는 객체가 Thread 상속, Runnable 상속해야 된다.
public class Ex07_Dog extends Thread{
	// 스레드 처리 안됨
     //	public void sound() {
		public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍~멍~ : " + Thread.currentThread().getName());
		}
	}
	// 스레드 처리 
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍~멍~ : " + Thread.currentThread().getName());
		}
	}
}
