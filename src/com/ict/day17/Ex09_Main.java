package com.ict.day17;

// 데몬 스레드 : 일반적인 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//            일반적인 스레드가 종료 되면 데몬 스레드는 강제로 종료된다.
public class Ex09_Main {
	public static void main(String[] args) {
		Ex09 test = new Ex09();
		// test.start();
		
		// 현재 main()가 종료 되어도 다른 스레드들은 일처리를 한다.
		Thread thread = new Thread(test);
		// 데몬 스레드가 되서 main이 끝나면 해당 스레드도 종료 된다.
		thread.setDaemon(true);
		thread.start();
		
		for (int i = 0; i < 15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("여기는 메인 : " + i);
		}
		System.out.println("수고하셨습니다.");
	}
}
