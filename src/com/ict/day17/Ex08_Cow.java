package com.ict.day17;

public class Ex08_Cow implements Runnable {
	// 스레드 처리 안님
	public void sound() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~음메~ : " + Thread.currentThread().getName());
		}
	}

	// 스레드 처리
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("음메~음메~  : " + Thread.currentThread().getName());
		}
	}
}
