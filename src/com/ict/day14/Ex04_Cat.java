package com.ict.day14;

public class Ex04_Cat extends Ex04_Animal{
	
	public void play() { 
		age =age + 10;
		System.out.println(age);
		
		
	}
	
	public void play02() {
//		final 변수 = 상수  = 변경불가
//		month = month+ 10;
		
	}
	
	@Override
	public void sound() {
		System.out.println("야옹~ 야옹");
	}
	
	//부모클래스의 메서드에 final있으면 오버라이드할 수 없다.
	/*
	@Override
	public final void sleep() {
		System.out.println("15시간 이상 잠 잔다 ");
	}
	*/
	
	
	
	
	
	
	

		
	
}
