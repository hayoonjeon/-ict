package com.ict.day14;

//인터페이스 : 서비스를 제공하는 목록
//다수의 구현체를 통일화된 명세로 정의하는 것 
//클래스들이 반드시 구현해야하는 메서드들의 목록을 정의하는 것
//상수와 추상메서드로 구성되어있음
//객체 생성안됨
//클래스의 상속과 달리 인터페이스 상속은 다중상속 가능
//인터페이스가 같다는 뜻은 대체가 가능하다는 뜻 

class Ex09 {

	int su1 = 10;
	static int su2 = 20;
	final int SU3 = 30;
	static final int SU4 = 40;
}

interface Ex10 {
	//인터페이스는 상수(static final)와
	//추상 메서드만 가질수 있따.

	int su1 = 10;
	static int su2 = 200;
	final int SU3 = 300;
	static final int SU4 = 400;
	
	//기본적으로 인터페이스ㅔㅇ서는 일반 메서드를 사용못함
	public static void like() {
		
	}
	
	
	//추상메서드
	public abstract void sound();
	//인터페이스에서는 abstract 생략 가능 
	public void play();
}
