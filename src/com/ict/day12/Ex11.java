package com.ict.day12;

public class Ex11 {
	public static void main(String[] args) {
		Ex09 test = new Ex09("홍길동", 90, 95, 97);
		
		System.out.println("이름 : " + test.getName());
		System.out.println("총점 : " + test.getSum());
		System.out.println("평균 : " + test.getAvg());
		System.out.println("학점 : " + test.getHak());
		System.out.println();
		
		Ex10 test2 = new Ex10("둘리", 98, 97, 100);
		System.out.println("이름 : " + test2.getName());
		System.out.println("총점 : " + test2.getSum());
		System.out.println("평균 : " + test2.getAvg());
		System.out.println("학점 : " + test2.getHak());
		
	}
}
