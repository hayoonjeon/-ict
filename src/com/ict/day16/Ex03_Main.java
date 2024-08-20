package com.ict.day16;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		// setter를 클래스에 데이터 저장
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(24);
		
		// 생성자를 이용해서 클래스에 데이터 저장
		Ex03 p2 = new Ex03("희동이", 3);
		Ex03 p3 = new Ex03("마이콜", 19);
		
		// 객체를 모아서 처리하는 방법 : 객체형 배열,  컬렉션
		// 1. 객체형 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		
		for (Ex03 k : arr) {
			System.out.println(k.getName());
			System.out.println(k.getAge());
		}
		System.out.println();
		
		// 2. 컬렉션이용(더 추가해도 상관없음)
		HashSet<Ex03> set01 = new HashSet<>();
		set01.add(p1);
		set01.add(p2);
		set01.add(p3);
		set01.add(new Ex03("공실이", 24));
		set01.add(new Ex03("도우너", 17));
		
		System.out.println("컬렉션 for문 사용");
		for (Ex03 k : set01) {
			System.out.println(k.getName());
			System.out.println(k.getAge());
		}
		
		System.out.println("컬렉션 iterator 사용");
		Iterator<Ex03> it = set01.iterator();
		while (it.hasNext()) {
			Ex03 ex03 = it.next();
			System.out.println(ex03.getName());
			System.out.println(ex03.getAge());
		}
	}
}






