package com.ict.day15;

public class Ex09_Static {
	String name = "홍길동";
	int age = 24 ;
	private String addr = "제주도";
	static String phone = "010-7979-7979";
	
	public void sound() {
		System.out.println("외부클래스의 메서드");
	}
	
	public static void prn() {
		System.out.println("외부클래스의 static 메서드");
	}
	
	// 내부클래스의 멤버가 static 이면 클래스도 static 으로 만들어야 한다.
	public static class Inner03{
		static int room = 3;
		
		public static void play() {
			// 인스턴스 필드와 메서드는 사용 불가 
			// System.out.println(name);
			// System.out.println(age);
			// System.out.println(addr); 
			// sound();
			
			System.out.println(room);
			System.out.println(phone);
			prn();
		}
		
		public void play2() {
			System.out.println(room);
			System.out.println(phone);
			prn();
		}
		
	}
}
