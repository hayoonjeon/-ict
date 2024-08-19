package com.ict.day12;

public class Ex16 {
	// this 와 this([인자]) 
	// this : 지역변수와 전역변수이름이 같을 때 우선 순위는 지역변수가 먼저이다.
	//        그래서 전역변수라고 지정하기 위해서는 this.변수 라고 변수앞에 this 라고 붙인다.
	//        객체 내부에서 객체 자신을 지징하는 예약어 
	
	// this([인자]) : 객체 내부에서 객체 자신의 생성자를 지칭하는 예약어
	//               생성자에서 다른 생성자를 호출할 때 사용 
	//               반드시 생성자의 첫번째 줄에 존재해야 한다. 
	//               첫번째 줄이 아니면 오류 발생 
	
	private String name = "고길동";
	private int age = 37 ;
	
	public Ex16() {
		System.out.println("기본생성자 : " + this);
	}
	public Ex16(String name) {
		this(17);
		System.out.println("이름고치는 생성자 : " + this);
		this.name = name;
	}
	public Ex16(int age) {
		this("태권브이", 100);
		this.age = age;
	}
	public Ex16(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
