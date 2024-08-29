package com.ict.day23;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex05_Stream {
	public static void main(String[] args) {
		// 특정 범위의 정수를 요소로 갖는 스트림 생성
		IntStream intStream = IntStream.range(1, 5); // 1,2,3,4
		intStream.forEach(i->System.out.print(i+" "));
		System.out.println();
		
		IntStream intStream2 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
		intStream2.forEach(i->System.out.print(i+" "));
		System.out.println();
		System.out.println();
		
		// 람다식을 소스로 하는 스트림 생성 : iterate(), generate() // 무한 스트림 생성
		// static <T> Stream<T> iterate(초기값, 람다식) ;  // 이전 요소에 종속적
		Stream<Integer> even = Stream.iterate(0, n -> n+2);
		even.limit(10).forEach(i->System.out.println(i));
		System.out.println();
		
		// static <T> Stream<T> generate(람다식) ;  // 이전 요소에 독립적 
		Stream<Integer> one = Stream.generate(() -> 1);
		one.limit(10).forEach(i-> System.out.println(i));
		System.out.println();
		
		// Stream<Double> two = Stream.generate(()->  Math.random());
		Stream<Integer> two = Stream.generate(()-> (int)(Math.random()*10));
		two.limit(10).forEach(i-> System.out.println(i));
	}
}













