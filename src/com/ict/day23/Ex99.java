package com.ict.day23;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex99 {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로부터 스트림 생성
		// int -> IntStream, double -> DoubleStream
		// IntStream<T> IntStream.of(int...values) //가변인수
		// IntStream<T> IntStream.of(int[])
		// IntStream<T> Arrays.stream(int[])
		// IntStream<T> Arrays.stream(int[],시작index, 끝index(포함x))

		// Stream<T> Arrays.stream(T[])
		// Stream<T>는 count(), sum(), average() X
		// 이문제해결하기위해 IntStream, DoubleStream 사용

		Integer[] arr01 = { 1, 2, 3, 4, 5 };
		Stream<Integer> stream01 = Arrays.stream(arr01);
		stream01.forEach(i -> System.out.println(i + 100));
		System.out.println();

		Stream<Integer> stream02 = Arrays.stream(arr01);
		System.out.println("총개수 : " + stream02.count());
		System.out.println();

		int[] arr02 = { 1, 2, 3, 4, 5 };
		IntStream intstream01 = IntStream.of(1, 2, 3, 4, 5);
		intstream01.forEach(i -> System.out.println(i));
		System.out.println();

		IntStream intstream02 = IntStream.of(arr02);
		System.out.println("총합계 : " + intstream02.sum());

		IntStream intStream03 = IntStream.of(arr02);
		System.out.println("총 개수 :" + intStream03.count());

		IntStream intStream04 = IntStream.of(arr02);
		System.out.println("총 평군 :" + intStream04.average().orElse(0.0));
		System.out.println();

		int[] arr03 = { 1, 2, 3, 4, 5 };
		int sum = Arrays.stream(arr03).sum();
		int count = (int)Arrays.stream(arr03).count();
		double avg = Arrays.stream(arr03,3,5).average().orElse(0.0);
		
		System.out.println(sum);
		System.out.println(count);
		System.out.println(avg);

	}
}
