package com.ict.day13;


public class Ex06_Main {

	public static void main(String[] args) {
//객체 생성 
//		부모 클래스 생성 
		Ex06_Sup test1 = new Ex06_Sup(); //부모
		test1.sound();
		System.out.println();
		//자식 클래스 생성 
		
		Ex06_Sub test2 = new Ex06_Sub(); //자식
		test2.play();
		//부모클래스의메서드를 사용가능
		test2.sound();
		System.out.println(test2.name);
		System.out.println(test2.addr);
		
		//선언 : 부모클래스  = 자식클래스생성자 사용  
		//메서드도 부모클래스 메서드만 가능함 
		Ex06_Sup test3 = new Ex06_Sub();
//		test3.play();
		test3.sound();
		//객체타입이 Ex06 sup으로 선언되었음으로 
		//Ex06 sub는 멤버필드와 멤버메서드 사용불가
	

		System.out.println(test3.name);
//		System.out.println(test3.addr);
		
		//컴파일오류
		// 자식클래스 = 부모 클래스생성자
//		Ex06_Sub test4 = new Ex06_Sup();
				
				
	}

}
