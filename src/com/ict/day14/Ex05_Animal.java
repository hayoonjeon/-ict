package com.ict.day14;

public class Ex05_Animal {
	String name = "동물";
	int age = 0;
	String addr = "서울";
	
	public Ex05_Animal(String name, int age, String addr) {
		
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	
	//r긱본생성자
	public Ex05_Animal() {
		System.out.println("부모클래스 기본 생성자"+this);
	}
	
	//이름,나이.주소를 받는 생성자 
	
}
