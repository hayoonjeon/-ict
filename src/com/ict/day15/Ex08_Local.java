package com.ict.day15;

public class Ex08_Local {
	String name = "둘리";
	int age = 3 ;
	String addr = "제주도";
	
	public Ex08_Local() {
		System.out.println("외부 : " + this);
	}
	public void sound() {
		String str = "호이~ 호이~";
		System.out.println(str);
	}
	
	// 내부클래스를 가진 메서드
	public void play() {
		int age = 147;
		int cnt = 10 ;
		
		// 내부 클래스
		class Inner02{
			String addr = "서울";
			// 생성자
			public Inner02() {
				System.out.println("내부 : " + this);
			} // 내부 생성자 끝
			
			public void like() {
				String addr="강원도";
				System.out.println(name);
				System.out.println(addr);
				// 내부 클래스의 전역변수
				System.out.println(this.addr);
				System.out.println(age);  // 147
			} // 내부메서드 끝
			
			public void setA(int k) {
				System.out.println(k);
			}
			
		} // 내부클래스 끝
		// 내부 클래스 생성
		Inner02 inner02 = new Inner02();
		inner02.like();
		// 여기서 this.age : 외부클래스의 전역변수 
		inner02.setA(this.age); //3
	} // 외부메서드 끝
}





