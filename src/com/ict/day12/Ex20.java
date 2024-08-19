package com.ict.day12;

public class Ex20 {
	// static : 객체 생성과 상관없이 미리 만들어지는 필드와 메서드 (반드시 static 예약어 사용)
	//          클래스와 지역변수에는 static 사용할 수 없다.
	//          static 메서드는 인스턴스 전역변수를 사용할 수 없다.
	//          static 메서드는 static 전역변수만 사용가능 
	//          접근법 : 클래스이름.변수,  클래스이름.상수,  클래스이름.메서드()
	int su = 10 ;
	static int num = 100 ;
	private static int number = 1000;
	
	public Ex20() {
		su++;
		num++;
		number++;
	}
	// 인스턴스
	public void play() {
		 su += 1000;
		 num += 1000;
		 number += 1000;
	}
	// static 메서드
	public static void play02() {
		// 인스턴스 변수 사용 못함
		// su += 1000;
		 num += 1000;
		 number += 1000;
		 // 지역변수에 static 사용 못함
		 //static int k = num + 1000;
		 int k2 = num + 1000;
	}
}





