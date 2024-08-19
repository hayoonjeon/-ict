package com.ict.day12;

public class Ex21 {
	// 인스턴스 변수와 상수는 생성자를 이용해서 변수, 상수의 초기값을 설정할 수 있다.
	
	// static 초기화 
	// static {
	//   초기화 내용
	// }
	
	int su1  ;
	int su2 = 100;
	static int su3;
	static int su4 = 1000;
	static int su5 ;
	
	// 위치에 상관이 없음 => 10000;
	// int su6 = 5000;
	public Ex21() {
		su1 = 10000;
		su2 = 10000;
		su3 = 10000;
		su4 = 10000;
		su5 = 10000;
		su6 = 10000;
	}
	int su6 = 5000;
	
	// 위치에 상관이 있음
	// static int su5 = 4000; => 5000
	static {
		// 인스턴스는 접근 불가
		// su1 = 200;
		su3 = 5000;
		su4 = 5000;
		su5 = 5000; 
		su7 = 5000;
	}
	 // => 4000
	static int su7;        // => 5000 
	
}







