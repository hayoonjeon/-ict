package com.ict.day14;

// 추상 클래스 : 하나 이상의 추상 메서드를 가지고 있는 클래스
//				일반적인 변수, 상수, 메서드를 가질 수 있다.
//	반드시 예약어를 써서 표시해야함 (abstract)
//		상속관계에서 부모클래스 역할을 받기 위한 클래스이다.
//		추상클래스는 new 동적할당자를 통해 인스턴스 객체를 만들 수 없습니다.






public abstract class Ex07_Animal {
	
	String name = "둘리";
	int age = 3;
	
	
	public void play() {
		System.out.println("열심히 운동하자");
		
		
		
		
	}
	
	//추상메서드 : body를 가지고 있지 않는 메서드 , (블록이 없음)
	//		즉 구체적으로 실행하는 실체가 없는 메서드(실행할 수행문이 없는 메서드)
	//		반드시 예약어를 써서 표시해야함 (abstract)
	public abstract void  sound();
	

	
	
}
