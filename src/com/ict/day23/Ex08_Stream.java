package com.ict.day23;

import java.util.stream.IntStream;

public class Ex08_Stream {
	public static void main(String[] args) {
		// 중간처리
		int[] arr = {1,2,3,4,5,1,2,3,4,5,1,2,3};
		
		
		
		// 그냥 출력
		IntStream s1 = IntStream.of(arr);
		s1.forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// distinct() : 중복제거
		s1 = IntStream.of(arr);
		s1.distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// filter(조건식) : 조건에 맞는 요소만 추출   
		s1 = IntStream.of(arr);
		// 짝수만 추출
		s1.filter(i -> i%2 == 0).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		s1 = IntStream.of(arr);
		// 짝수만 추출 (중복제거)
		s1.filter(i -> i%2 == 0).distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		//  limit(개수) : 개수 만큼 자르기
		s1 = IntStream.of(arr);
		s1.limit(4).forEach(i -> System.out.print(i + " "));
		System.out.println();
		
		// skip(개수)  : 개수 만큼 건너뛰기
		s1 = IntStream.of(arr);
		s1.skip(4).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}
}







