package com.ict.day24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_Stream {
	public static void main(String[] args) {
		// 최종연산 : 실행하면 스트림 닫히기 때문에 재사용 불가 
		// reduce([초기값,] 수행할 기능) : 스트림의 요소를 하나씩 꺼내서 줄여가면서 계산한다.
		
		List<Integer> num = Arrays.asList(1,2,3,4,5);
		// 초기값이 없은 reduce 사용
		 Optional<Integer> sum =  num.stream().reduce((a,b) -> a+b);
		 System.out.println("합계 : " + sum);
		 System.out.println("합계 : " + sum.get());
		 // 값이 없으면 0 이 된다.
		 System.out.println("합계 : " + sum.orElse(0));
		// 1+2 = 3
		// 3(1+2) + 3 = 6
		// 6(1+2+3) + 4 = 10 
		// 10(1+2+3+4) + 5 = 15 
		System.out.println(); 
		 
		num = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream =  num.stream();
		Optional<Integer> sum2 = stream.reduce((i,j) -> Integer.sum(i, j));
		System.out.println("합계 : " + sum2.orElse(0));
		System.out.println();
		
		num = Arrays.asList(1,2,3,4,5);
		Stream<Integer> stream2 =  num.stream();
		int sum3 = stream2.reduce(1000, (i,j) -> Integer.sum(i, j));
		System.out.println("합계 : " + sum3);
		System.out.println();
		
		
		// mapToInt() : Stream<Integer> ->  IntStream 변환 시키는 역할을 한다.
		IntStream intStream = num.stream().mapToInt(i -> i.intValue());
		System.out.println("합계 : " + intStream.sum()); 
		
		intStream = num.stream().mapToInt(i -> i.intValue());
		System.out.println("평균 : " + intStream.average().orElse(0.0)); 
		
		intStream = num.stream().mapToInt(i -> i.intValue());
		System.out.println("개수 : " + intStream.count()); 
		 
		 
		 
		 
	}
}
