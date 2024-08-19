package com.ict.day10;

public class Ex05 {

	int cnt1 = 0; //인스턴스
	static int cnt2 = 0; //스태틱 

	public void countUp1() {
		cnt1 = cnt1 + 1; //인스턴스 
		//인스턴스메서드는 static 변수 사용가능 
		cnt2 = cnt2 + 1;
	}
	
	public static void countUp2() { //스태틱 
		//cnt1 = cnt1 + 1; : 스태틱메서드는 인스턴스변수 사용불가
		cnt2 = cnt2 + 1;
	}

		
}
