package com.ict.day14;


//final 변수 = 상수 = 데이터 변경 금지
//final 메서드 = 오버라이딩 방지 = 부모클래스메서드 변경금지 
//final 클래스 =  상속금지 (자식클래스 생성 금지)

public class Ex04_Animal {
	
	int age = 2;
	final int month = 2;
	
	
	public void sound() {
		System.out.println("울음소리");
	}
	
	public final void sleep() {
		System.out.println("15시간 이상 잠 잔다 ");
	}
	
	
	
	
	
	
	
	
	
	
	

		
	
}
