package com.ict.day17;

public class Ex07_Cow extends Thread{
	// 스레드 처리 안됨
    //	public void sound() {
		public void start() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~음메~ : " + Thread.currentThread().getName());
		}
	}
	// 스레드 처리
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~음메~ : " + Thread.currentThread().getName());
		}
	}
}
