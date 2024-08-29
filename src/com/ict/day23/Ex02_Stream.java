package com.ict.day23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex02_Stream {
	public static void main(String[] args) {
		// 스트림 생성: 배열을 Stream 으로 반환
		// Stream<T>  Stream.of(T... values) // 가변인수 : 인자의 수가 정해지지 않은 인수
		// Stream<T>  Stream.of(T[])
		// Stream<T>  Arrays.stream(T[])
		// Stream<T>  Arrays.stream(T[], 시작 index, 끝 index(포함X))
		
		String[] arr = {"홍길동","고길동","이길동","김길동","박길동", "나길동"};
		
		Stream<String> st01 = Stream.of("홍자바","김자바","박자바","나자바");
		st01.forEach(i-> System.out.println(i));
		// 최종 연산이 forEach 사용 후 또 사용 못함
		// System.out의 println 메서드를 참조한다는 뜻 (메서드 참조)
		// st01.forEach(System.out::println); 
		System.out.println();
		
		Stream<String> st02 = Stream.of(arr);
		st02.forEach(i-> System.out.println(i+"님"));
		System.out.println();
		
		Stream<String> st03 = Arrays.stream(arr);
		st03.forEach(i-> System.out.println(i+" ^^"));
		System.out.println();
		
		Stream<String> st04 = Arrays.stream(arr,1,4); // index가 1~3
		st04.forEach(i-> System.out.println(i+" $$"));
		System.out.println();
		
		// 스트림 생성 : 컬렉션을 Stream 변환
		//           Arrays.asList => 배열을 List 로 만드는 메서드
		//  Stream = 컬렉션.stream()  
		List<String> list = Arrays.asList("둘리","도우너","고길동","마이콜");
		Stream<String> st05 = list.stream();
		st05.forEach(i -> System.out.println(i));
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		
		Stream<Integer> st06 = list2.stream();
		st06.forEach(i -> System.out.println(i + 4));
	}
}









