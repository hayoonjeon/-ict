package com.ict.day15;

// 인터페이스를 부모로 정의한 일반클래스는 부모 인터페이스의 추상메서드을 오버라이드해야 한다.
public class Ex02_ImplementC implements Ex02_interfaceC{
	@Override
	public void methodA() {
		System.out.println("methodA 실행");
	}

	@Override
	public void methodB() {
		System.out.println("methodB 실행");
	}

	@Override
	public void methodC() {
		System.out.println("methodC 실행");
	}
}
