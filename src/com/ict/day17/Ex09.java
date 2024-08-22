package com.ict.day17;

public class Ex09 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			try {
				// 3초간 쉬자
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("aaaa : " + Thread.currentThread().getName());
		}
	}
}
