package com.ict.day23;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		// 스트림 생성 : 기본 자료형 배열로 부터 스트림 생성
		//            int -> IntStream, double -> DoubleStream
		// IntStream<T>  IntStream.of(int... values) // 가변인수 : 인자의 수가 정해지지 않은 인수
		// IntStream<T>  IntStream.of(int[])
		// IntStream<T>  Arrays.stream(int[])
		// IntStream<T>  Arrays.stream(int[], 시작 index, 끝 index(포함X))
		
		// Stream<T>  Arrays.stream(T[])
		// Stream<T>는 count(), sum()X, average() X
		// 이 문제를 해결하려면 int -> IntStream, double -> DoubleStream
		
		Integer[] arr01 = {1,2,3,4,5};
		Stream<Integer> stream01 = Arrays.stream(arr01);
		stream01.forEach(i -> System.out.println(i +100));
		
		Stream<Integer> stream02 = Arrays.stream(arr01);
		System.out.println("총 개수 : " + stream02.count());
		// System.out.println("합계 : " + stream02.sum());
		// System.out.println("평균 : " + stream02.average());
		System.out.println();
		
		// 이번에는 기본자료형 배열을 스트림으로 만들자 (숫자를 다룰 때 편하다)
		// IntStream : count(), sum(), average()
		int[] arr02 = {1,2,3,4,5};
		IntStream intStream01 = IntStream.of(1,2,3,4,5);
		intStream01.forEach(i -> System.out.println(i));
		System.out.println();
		
		IntStream intStream02 = IntStream.of(arr02);
		System.out.println("총 개수 : " + intStream02.count());
		
		IntStream intStream03 = Arrays.stream(arr02);
		System.out.println("총 합계 : " + intStream03.sum());
		
		IntStream intStream04 = Arrays.stream(arr02,2,5);
		// System.out.println("총 평균 : " + intStream04.average()); // (3+4+5)/3 = 4.0 
		// orElse(0.0)를 사용하면 값이 없는 경우 0.0을 기본값으로 반환한다.
		System.out.println("총 평균 : " + intStream04.average().orElse(0.0)); 
		System.out.println(); 
		
		int[] arr03 = {1,2,3,4,5};
		int sum = Arrays.stream(arr03).sum();
		int count = (int) Arrays.stream(arr03).count();
		double avg = Arrays.stream(arr03,2,5).average().orElse(0.0);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("개수 : " + count);
	}
}








