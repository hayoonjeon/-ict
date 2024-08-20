package com.ict.day16;

import java.util.Iterator;
import java.util.Stack;

public class Ex10 {
	public static void main(String[] args) {
	/*
		List 인터페이스 : 배열과 흡사한 구조
		               삽입, 삭제, 추가 가 자유롭다.
		               크기를 미리 지정하지 않아도 된다.
		               중복 가능. 
	    List 를 구현한 클래스 : Stack, Vector, ArrayList
	                구조 : LIFO(Last In First Out)
	                     마지막에 들어온 데이터가 가장 먼저 나가는 형태 
	      add, push, addElement => 추가 
	      add(index, E)         => 삽입  
	      * push : 스택에서 객체 추가
	      * pop :  스택에서 맨 위에 존재하는 객체 반환 후 삭제 된다.
	      * peek : 스택에서 맨 위에 존재하는 객체 반환 후 삭제 되지 않는다.
	      contains(Element e):boolean => 해당 Element가 포함되어 있으면 true
	      search(Object o) : int  => 검색 (오른쪽 1부터)
	      indexOf(Object o) : int =>  검색 (왼쪽 0부터) => 배열형식과 같음
	      elementAt(index) : 해당 위치 요소 반환
	      ** get(index) :    해당 위치 요소 반환 
	      firstElement() :  맨 처음 요소 반환  
	      lastElement()  :  맨 마지막 요소 반환
	      setElement(Element, index) : 바꾸기(치환)
	      
	 */
		// 스택 컬렉션 만들기 
		Stack<String> s1 = new Stack<String>();
		// 추가
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		// 삽입
		s1.add(1,"희동이");
		s1.addFirst("고길동");
		s1.addLast("도우너");
		
		System.out.println(s1);
		
		// 마지막 객체 : pop(삭제), peek(삭제 안함)
		String res =  s1.pop();
		System.out.println("마지막 위치에 있는 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		res =  s1.peek();
		System.out.println("마지막 위치에 있는 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		// 처음, 마지막 객체 : firstElement, lastElement
		res =  s1.lastElement();
		System.out.println("마지막 위치에 있는 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		res =  s1.firstElement();
		System.out.println("처음 위치에 있는 객체 : " + res);
		System.out.println(s1);
		System.out.println();
		
		// 특정위치 검색 : get(index), elementAt(index), getFirst, getLast
		System.out.println(s1.get(2));
		System.out.println(s1.elementAt(2));
		System.out.println(s1.getFirst());
		System.out.println(s1.getLast());

		if(s1.contains("홍길동")) {
			System.out.println("존재한다.");
		}else {
			System.out.println("존재하지 않는다.");
		}
		
		// 중복 가능
		s1.add("둘리");
		s1.push("공실이");
		s1.addElement("마이콜");
		
		System.out.println(s1);
		System.out.println();
		// 고길동을 도우너로 변경하자. 
		// indexOf(Object o) : int =>  검색 (왼쪽 0부터) => 배열형식과 같음
		if(s1.contains("고길동")) {
			s1.setElementAt("도우너", s1.indexOf("고길동"));
		}
		System.out.println(s1);
		System.out.println();
		
		// 둘리를 찾아서 홍길동으로 변경 
		if(s1.contains("둘리")) {
			s1.setElementAt("홍길동", s1.indexOf("둘리"));
		}
		System.out.println(s1);
		System.out.println();
		
		// 검색 : indexOf(Object o) : int, => 배열처럼 왼쪽부터 시작 , 0 부터 시작   
		//       search(Object o) : int   =>  오른쪽부터 시작, 1부터 시작
		// 희동이 찾기
		System.out.println(s1.indexOf("희동이"));
		System.out.println(s1.search("희동이"));
		System.out.println();
		
		// 하나씩 꺼내기 
		for (String k : s1) {
			System.out.println(k);
		}
		System.out.println("======================");
		
		Iterator<String> it = s1.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k);
		}
	}
}









