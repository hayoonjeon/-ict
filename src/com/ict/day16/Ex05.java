package com.ict.day16;

import java.util.HashSet;

public class Ex05 {
	public static void main(String[] args) {
		String[] arr = {"java", "Java", "JAVA", "자바"};
		
		// 배열의 내용을 set 컬렉션에 넣자
		// 만약에 ArrayList 컬렉션이면 List<String> list = Arrays.asList(arr); 
		
		HashSet<String> set1 = new HashSet<String>();
		for (int i = 0; i < arr.length; i++) {
		     set1.add(arr[i]);
		}
		System.out.println(set1);
		System.out.println();
		
		set1.add("Spring");
		set1.add("JSP");
		
		System.out.println(set1);
		System.out.println();
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("HTML");
		set2.add("CSS");
		set2.add("JS");
		// set1과 중복되는 요소
		set2.add("자바");
		
		System.out.println("set2 요소 보기");
		System.out.println(set2);
		// set1에 모든 객체를 set2에 넣기(addAll)
		set2.addAll(set1);
		System.out.println();
		
		System.out.println("set2 요소 보기");
		System.out.println(set2);
		System.out.println();
		
		// 삭제 :  remove(Object o), clear();
		System.out.println("set2 자바 요소 삭제");
		set2.remove("자바");
		System.out.println(set2);
		System.out.println();
		
		System.out.println("set2 전체 삭제");
		set2.clear();
		System.out.println(set2);
		System.out.println();
		
		System.out.println("set2 비어있는지 확인하는 것");
		if(set2.isEmpty()) {
			System.out.println("set2 비어있음");
		}else {
			System.out.println("set2 내용이 있음");
		}
	}
}











