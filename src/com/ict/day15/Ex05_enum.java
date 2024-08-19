package com.ict.day15;

enum Type2{
	WALK("워킹화", 250),
	RUN("러닝화", 255),
	TRACK("트래킹화",265),
	HIKING("하이키화",270);
	
	private final String name;
	private final int size ;
	
	// 생성자 역할을 하는 메서드
	private Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// getter만 생성하자
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
	
	
}

public class Ex05_enum {
	public static void main(String[] args) {
		// enum를 배열로 반환하는 메서드  : values()
		Type2[] arr =  Type2.values();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ":" + arr[i].getSize());
		}
	}
}









