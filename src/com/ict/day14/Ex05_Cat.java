package com.ict.day14;

public class Ex05_Cat extends Ex05_Animal{
	
	//this : 객체 안에서 자기자신을 지칭할때 사용하는예약어 
	//super : 객체 안에서 부모클래스 지정할떄 사용하는예약어
	//this() : 자기자신의 생성자를 뜻함.생성자 첫줄에있어야함
	//		반드시 생성자 첫줄에 있어야 한다. 
	//super() : 자식클래스의 생성자에서 부모클래스의 생성자를 호출할떄사용
	//반드시 첫쨰줄에서 사용 
	String nickName = "짜오";
	int age = 1;
	
	//기본 생성자
	public Ex05_Cat() {
		super("땅콩이",3,"제주도");
		//부모클래스 생성자를 가리키는것이 생략되어있음.(super() )
		System.out.println("자식클래스 기본생성자"+this);
	}
	public Ex05_Cat(String nickName, int age) {
		this();
		this.nickName = nickName;
		this.age = age;
	}
	
	
	public void play() {
		//우선순위 : 지역변수 >지역변수 > 부모변수 > 부모전역변수
		System.out.println(nickName);
		System.out.println(age);
		System.out.println(addr);
		System.out.println();
		System.out.println(super.age);
	}

	

		
	
}
