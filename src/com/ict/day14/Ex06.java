package com.ict.day14;

public class Ex06 {
	
	
	String name = "홍길동";
	int age = 14;
	
	static String addr = "제주도";
	
	public void play() {
		System.out.println("이름+"+name);
		System.out.println("나이+"+age);
		
	}
	public static void sound() {
		System.out.println("음악듣기");
	}
	
	public static void main(String[] args) {

//		static 메서드는 static 변수, 상수만 사용가능
//		System.out.println(name);
//		System.out.println(age);
		System.out.println("주소 : " + addr);

//		play();
		sound();
		
		//인스턴스 변수와 메서드를 사용하기 위해 서는 객체생성이 먼저다. 
		
		Ex06 test = new Ex06();
		System.out.println(test.name);
		System.out.println(test.name);
		test.play();
	}
}
