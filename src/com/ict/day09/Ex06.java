package com.ict.day09;

public class Ex06 {
	public static void main(String[] args) {
		// Ex05 객체 생성하자
		Ex05 t1 = new Ex05();
		
		String name = t1.name;
		System.out.println(name);
		
		int sum = t1.sum;
		System.out.println(sum);
		
		// 메서드 호출
		System.out.println("호출전");
		t1.play01();
		System.out.println("호출후");
		
		sum = t1.sum;
		System.out.println(sum);
		
		// 메서드 호출
		String k2 = t1.play03();
		System.out.println(k2);
		
	}
}
