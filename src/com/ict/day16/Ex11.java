package com.ict.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex11 {
	public static void main(String[] args) {
//		  List 인터페이스 : 배열과 흡사한 구조
//        삽입, 삭제, 추가 가 자유롭다.
//        크기를 미리 지정하지 않아도 된다.
//        중복 가능. 
//        List 를 구현한 클래스 : Stack, Vector, ArrayList
		  // ArrayList : 멀티스레드에서 동기화 지원 X
		  //             여러 스레드가 동시에 접근하는 상황에서 문제 발생할 수 있다.
		  // Vector    : 멀티스레드에서 동기화 지원 O
		  //            여러 스레드가 동시에 접근하는 상황에서 문제을 해결한다.   
		
		 List<String> list = new ArrayList<String>();
		 List<String> vector = new Vector<String>();
		 
		 ArrayList<String> list2 = new ArrayList<String>();
		 Vector<String> vector2 = new Vector<String>();
		 
		 // 추가 : add(), addFirst, addLast()
		 list.add("손흥민");
		 list.add("김민제");
		 list.add("차두리");
		 list.addFirst("차범근");
		 list.addLast("박지성");
		 
		 // 삽입 : add(index, element)
		 list.add(2, "이영표");
		 
		 // 중복 가능
		 list.add("손흥민");
		 list.add("차두리");
		 
		 System.out.println(list);
		 
		 // 특정위치 검색 : get(index), getFirst(),getLast()
		System.out.println(list.get(4));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		// 차두리 찾아서 이강인으로 변경하기  
		 if(list.contains("차두리")) {
			 list.set(list.indexOf("차두리"), "이강인");
		 }
		 System.out.println(list);
		 System.out.println();
		 
		 // 손흥민 삭제하기 ( 먼저 있는 것이 삭제 됨)
		 boolean b = list.remove("손흥민");
		 System.out.println(b);
		 System.out.println(list);
		 System.out.println();
		 
		 String k = list.removeFirst();
		 System.out.println(k);
		 System.out.println(list);
		 System.out.println();
		 
		 k = list.removeLast();
		 System.out.println(k);
		 System.out.println(list);
		 System.out.println();
		 
		 // 출력하기 
		 for (String ls : list) {
			System.out.println(ls+"님 환영합니다.");
		}
		System.out.println();
		 
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String msg =  it.next();
			System.out.println(msg + " ^^");
		}
		 
		 
		 System.out.println(list.size());
		 
		 list.clear();
		 System.out.println(list);
		 
		 if(list.isEmpty()) {
			 System.out.println("비어 있음");
		 }else {
			 System.out.println("하나라도 있음");
		 }
		 
		 
	}
}










