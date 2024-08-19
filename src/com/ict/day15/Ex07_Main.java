package com.ict.day15;

public class Ex07_Main {
	public static void main(String[] args) {
		// Member 내부클래스는 별도로 객체 생성 안됨
		// Inner01 test = new Inner01();
		
		// Member 내부클래스는 외부클래스를 통해서 객체 생성 가능
		// 1. 외부클래스 객체 생성
		Ex07_Member t1 = new Ex07_Member();
		
		// t2 주소(내부클래스주소)에는 $ 가 존재한다. 
		// Inner01  t2 =  t1.new Inner01();         // 가능
		Ex07_Member.Inner01 t2 = t1.new Inner01();  // 가능
		
		System.out.println(t2.room);
		// 오류
		// System.out.println(t2.name);
		System.out.println();
		t2.play();
		
		
	}
}
