package com.ict.day15;

public class Ex07_Member {
	String name = "홍길동";
	int age = 24 ;
	private String addr = "제주도";
	
	public Ex07_Member() {
		System.out.println("외부 : " + this);
	}
	
	public void sound() {
		System.out.println("외부클래스의 메서드");
	}
	
	// 내부 클래스
	public class Inner01{
		int room = 3 ;
		// 생성자
		public Inner01() {
			System.out.println("내부 : " + this);
		}
		public void play() {
			// 외부 클래스의 멤버필드와 메서드를 마음대로 사용 가능(private 가능)
			System.out.println(name); // 외부 변수
			System.out.println(age);  // 외부 변수
			System.out.println(addr); // 외부 변수 
			System.out.println(room); // 내부 변수
			
			sound(); // 외부 메서드
		}
	} // 내부클래스 끝
}







