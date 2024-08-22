package com.ict.day17;

public class Ex08_Dog implements Runnable {
	// 스레드 처리 안님
	public void sound() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍~멍~ : " + Thread.currentThread().getName());
		}
	}

	// 스레드 처리
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("멍~멍~: " + Thread.currentThread().getName());
		}
	}
}
