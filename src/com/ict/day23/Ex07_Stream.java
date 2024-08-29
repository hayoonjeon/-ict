package com.ict.day23;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex07_Stream {
	public static void main(String[] args) {
		// 비어 있는 객체 스트림 생성  
		// Stream.empty(), IntStream.empty(), DoubleStream.empty() 
		Stream<String> st01 = Stream.empty();
		System.out.println("요소의 수 : " + st01.count());
		System.out.println();
		
		IntStream st02 = IntStream.empty();
		System.out.println("요소의 수 : " + st02.count());
		System.out.println();
		
		DoubleStream st03 = DoubleStream.empty();
		System.out.println("요소의 수 : " + st03.count());
		System.out.println();
		
		// 비어 있는 스트림 생성
		Stream<String> st04 = Stream.empty();
		
		// 데이터가 있는 스트림 생성 
		Stream<String> dataStream = Stream.of("하나", "둘", "셋");
		
		// 스트림 결합 : Stream.concat(빈 스트림, 데이터스트림)
		Stream<String> resStream = Stream.concat(st04, dataStream);
		
		resStream.forEach(i -> System.out.println(i));
		
		
	}
}




