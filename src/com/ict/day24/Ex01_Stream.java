package com.ict.day24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Ex01_Stream {
	public static void main(String[] args) {
		// ArrayList
		List<String> list = new ArrayList<String>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");
		
		// ArrayList -> Stream
		Stream<String> stream = list.stream();
		stream.forEach(i -> System.out.println(i + " "));
		System.out.println();
		
		// 중간처리 : 정렬 =>  sorted()(오름차순), 
		//                 sorted(Comparator.reverseOrder())(내림차순)
		stream = list.stream();
		stream.sorted().forEach(i -> System.out.println(i + " "));
		System.out.println();
		
		stream = list.stream();
		stream.sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i + " "));
		System.out.println();
		
		// 오름차순 : 숫자 -> 대문자 -> 소문자 -> 한자 -> 한글
		Stream<String> stream2 
			= Stream.of(new String[] {"bb", "ba", "마","G", "K", "a", "0", "大", "가", "5" ,"1"});
		stream2.sorted().forEach(i -> System.out.println(i + " "));
		System.out.println();
	}
}











