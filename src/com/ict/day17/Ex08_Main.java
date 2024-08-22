package com.ict.day17;

public class Ex08_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		
		// 객체 생성 
		Ex08_Dog dog = new Ex08_Dog();
		Ex08_Cow cow = new Ex08_Cow();
		Ex08_Cat cat = new Ex08_Cat();
		
		// start() 가 안됨, Runnable 는 start()가 없음
		// dog.start();
		
		// Thread(Runnable 인터페이스를 상속받은 객체)
		Thread test1 = new Thread(dog);
		test1.start();
		
		Thread test2 = new Thread(cow);
		test2.start();
//		
		// 익명
		new Thread(cat).start();
		
		// 익명 : 안드로이드 식
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println("aaaa : " + Thread.currentThread().getName() ) ;
				}
			}
		}).start();
		
		System.out.println("수고하셨습니다.");
	}
}






