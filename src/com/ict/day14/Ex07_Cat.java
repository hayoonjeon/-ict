package com.ict.day14;

//추상클래스 상속
// 1. 일반적인 클래스가 추상클래스 상속하면
//일반적인 클래스는 추상메서드를 오버라이딩해서 완성

 class Ex07_Cat extends Ex07_Animal{

	@Override
	public void sound() {
	System.out.println("야옹");
		
	}
	
}
 //2. 추상클래스가 추상클래스 상속하면 오버라이딩을 하지 않는다 
 //객체 생성 못함
 //사용하기 위해서는 나중에 일반클래스가 상속을 받아야 한다.
abstract class Ex07_Dog extends Ex07_Animal{

}

abstract class Ex07_Cow extends Ex07_Animal{
	
	@Override
	public void sound() {
	System.out.println("음메");
		
	}
	public abstract void like();
	
	
}


abstract class Ex07_Chicken extends Ex07_Animal{
	public abstract void sleep();
	
}

//일반클래스는 무조건 추상메서드 구현해야한다 (오버라이드해야한다)
class Ex07_MyDog extends Ex07_Animal{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	

	
	
}

abstract class Ex07_MyCow extends Ex07_Animal{

	@Override
	public void sound() {
		System.out.println("뛰어놀기");
	}
	public abstract void like();
	
}

class Ex07_MyChicken extends Ex07_Chicken{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

	