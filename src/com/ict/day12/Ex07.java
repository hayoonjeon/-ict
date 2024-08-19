package com.ict.day12;

public class Ex07 {
	// 생성자는 메서드를 호출 할 수 있다.
	private String name ="홍길동";
	private int age = 24 ;
	private String addr = "충청도";
	private String phone  ;
	
	// 생성자
	public Ex07() {
		this.name = "둘리";
		// 생성자가 메서드 호출
		play01();
		play02("010-7979-7979");
	}
	// 메서드
	public void play01() {
		System.out.println("이름 : " + name);
	}
	
	public void play02(String k) {
		// 메서드가 다른 메서드 호출
		setPhone(k);
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void play03(int k) {
    	// 메서드가 생성자를 호출하는 것은 오류
		// Ex07();
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	
	
	
}
