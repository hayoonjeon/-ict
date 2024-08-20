package com.ict.day16;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// 특징 : 중복불가, 특정기준으로 정렬이 안됨
		//       (단, TreeSet은 항상 오름차순을 유지한다.)
		//       주머니 구조라고 생각하자
		// 형식) HashSet<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>();
		//      TreeSet<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>();
		//      Set<제네릭=객체타입=클래스> 참조변수 = new HashSet<[제네릭]>();
		//      Set<제네릭=객체타입=클래스> 참조변수 = new TreeSet<[제네릭]>();
		
		// 1. 컬렉션 생성
		// 제네릭타입에 기본자료형은 사용 불가 
		// HashSet<int> h1 = new HashSet<int>();
		
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<String> h2 = new HashSet<>();
		HashSet<Double> h3 = new HashSet<>();
		
		// 2. 컬렉션에 객체 넣기(add(E e))
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("20");
		
		h1.add(k1);
		h1.add(k2);
		h1.add(new Integer(30));
		h1.add(new Integer("40"));
		// int => Integer  : 기본자료형을 객체로 변경(오토박싱)
		h1.add(50);
		
		// 제넥릭 타입이 안맞아서 오류 발생 
		// h1.add("60");
		// h1.add('c');
		// h1.add(3.14);
		
		// 배열모양의 내용이 나옴
		System.out.println(h1);
		
		// 일반적인 for문 을 사용할 수 없다.
//		for (int i = 0; i < h1.size(); i++) {
//			System.out.println(h1[i]);
//		}
		
		// 개선된 for문 사용 
		for (Integer k : h1) {
			// Integer => int : (객체에서 기본자료형으로 변경(언박싱)
			System.out.println(k+2);
		}
		System.out.println();
		
		Iterator<Integer> it = h1.iterator();
		while (it.hasNext()) {
			int su = it.next();
			System.out.println(su+7);
		}
		System.out.println();
		
		h3.add(3.14);
		// 10은 Double 이 아니라서 안됨 (프로모션이 안됨)
		// h3.add(10);
		

	}
}







