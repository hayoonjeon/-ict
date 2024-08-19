package com.ict.day09;

public class Ex03 {
	public static void main(String[] args) {
		// 클래스를 객체 생성없이 사용 가능 => static
        // static 호출방법 : 클래스이름.멤버필드이름
		double k1 = Ex02.height ;
		System.out.println(k1);
		
		char k2 = Ex02.HAK;
		System.out.println(k2);
		
		// Ex02 클래스를 객체로 만들자 
		// 객체 생성방법 : 클래스이름 참조변수 = new 생성자([인자]);
		// Ex02 클래스에 생성자 없다. => 자바컴파일러가 기본생성자로 생성한다.
		// 기본생성자란 인자가 없는 생성자이다.
		// test에는 Ex02클래스 객체로 만든 객체 주소가 저장 된다. 
		Ex02 test = new Ex02();
		System.out.println(test);
		
		// 객체를 이용해서 변수와 상수에 접근
		// 참조변수.멤버필드이름
		String k3 = test.name ;
		System.out.println(k3);
		
		int k4 = test.AGE;
		System.out.println(k4);
		
		double k5 = test.height;
		System.out.println(k5);
		
		char k6 = test.HAK;
		System.out.println(k6);
		
		double k7 = Ex02.height ;
		System.out.println(k7);
		
		char k8 = Ex02.HAK;
		System.out.println(k8);
		System.out.println();
		
		// 변수는 데이터 변경이 가능하다.
		test.name = "둘리";
		Ex02.height = 182.45 ;
		
		String k9 = test.name ;
		System.out.println(k9);
		
		double k10 = test.height;
		System.out.println(k10);
		
		// 상수는 데이터 변경이 안된다.
		// test.AGE = 35 ;
		// Ex02.HAK = 'F';		
	}
}








