package com.ict.day24;

public class Ex05_VO {
	private String name;
	private int age;
	private int price ;
	
	public Ex05_VO() {}

	public Ex05_VO(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	// 가지고 있는 변수들을 String 으로 내보내는 기능
	@Override
	public String toString() {
		return "name : " + name + "age : " + age + "price : " + price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
