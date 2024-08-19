package com.ict.day14;

public class Ex01_Dog extends Ex01_Animal {

	//자식클래스가 부모클래스의 메서드를 가져와서 
	//마음대롭 변경해서 사용하는 것을 오버라이딩(재정의)이라 한다
	String name = "댕댕이";
	@Override
	public void sound() {
		
		System.out.println("멍멍");
	
	}
	
	
	
}
