package com.ict.day12;

public class Ex17 {
	public static void main(String[] args) {
		Ex16 test = new Ex16();
		System.out.println("main : " + test);
		System.out.println("이름 : " + test.getName());
		System.out.println("나이 : " + test.getAge());
		System.out.println();
		
		Ex16 test2 = new Ex16("마이콜");
		System.out.println("main2 : " + test2);
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
	}
}
