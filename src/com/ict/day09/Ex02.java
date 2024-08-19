package com.ict.day09;

public class Ex02 {
	// 클래스 구성요소 : 멤버필드, 멤버메서드, 생성자 
	// 멤버필드 : 데이터, 상태값, 속성
	//   1. 변수 : 언제든지 변할 수 있는 데이터, 속성, 메모리 상태
	//   2. 상수 : 한번 지정하면 변경할 수 없는 데이터, 속성, 메모리 상태
	
	// instance 멤버필드, static 멤버필드
	//  1. instance 멤버필드 : 객체 생성할 때 같이 만들어지는 멤버필드
	//              호출방법 : 참조변수.변수이름
	//  2. static 멤버필드 : 객체 생성과 상관없이 미리 만들어지 변수
	//              호출방법 : 클래스.변수이름
	//     static 은 반드시 static 이라는 예약어를 사용해야 한다.
	
	//  3. final 변수 => 상수
	
	String name = "홍길동";          // 인스턴스 변수 
	final int AGE = 27 ;           // 인스턴스 상수   
	static double height = 179.14; // static 변수
	static final char HAK = 'A';   // static 상수 
	
}
