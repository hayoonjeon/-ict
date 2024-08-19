package com.ict.day15;

public class Ex01_MyClass {
	Ex01_Remote rc ;
	
	// 생성자
	public Ex01_MyClass() {
		rc = new Ex01_TV();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 생성자 
	// 매개변수 Ex01_Remote 이면 
	// Ex01_Remote 를 부모로 가지고 있는 
	// TV, Audio 를 둘다 받을 수 있다.
	public Ex01_MyClass(Ex01_Remote rc) {
			this.rc = rc ;
			rc.turnOn();
			rc.setVolume(7);
	}
	
	
	
}
