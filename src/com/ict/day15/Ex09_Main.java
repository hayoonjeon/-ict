package com.ict.day15;

import com.ict.day15.Ex09_Static.Inner03;

public class Ex09_Main {
	public static void main(String[] args) {
		// static 내부 클래스는 그냥 static 접근 방식으로 사용하면 된다.
		// 즉, 클래스이름.변수이름,  클래스이름.메서드()
		
		// room static 이므로  사용 가능
		System.out.println(Inner03.room);
		System.out.println();
		
		// play() 이므로 사용가능
		Inner03.play();
		System.out.println();
		
		// static 내부 클래스를 별도로 객체 생성한다.
		Inner03 test = new Inner03();
		test.play2();
	}
}
