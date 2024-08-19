package com.ict.day14;

//인터페이스 상속
//1.일반클래스가 인터페이스를 부모로 해서 상속받으면 반드시 오버라이딩해야한다


 class Ex12 implements Ex10 {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
 }

//	2. 추상클래스를 인터페이스를 부모로 해서 상속받으면 오버라이딩 안한다. 
	abstract class Ex13 implements Ex10{
		
		
	}
	
	//3.인터페이스가 인터페이스를 부모로 상속을 받으면 오버라이딩하지않는다
	
	interface Ex14 extends Ex10{
		
		
	}


