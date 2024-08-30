package com.ict.day24;

import java.util.Optional;
import java.util.stream.Stream;

public class Ex03_Stream {
	public static void main(String[] args) {
		// 최종연산 : 실행하면 스트림 닫히기 때문에 재사용 불가 
		// findAny() : 아무거나 하나 반환 (입력순서와 상관없다.)
        // findFirst() : 첫번째 요소 반환 (순서가 중요하다.)
		
		// Optional : null로 인해 발생할 수 있는 오류 방지, 
		//            값이 없을 때는 Optional.empty 를 반환
		Optional<String> op = Optional.of("Hello");
		System.out.println(op.get()); // hello
		System.out.println();
		
		op = Optional.empty();
		// isPresent() => 데이터가 있을 때 : true
		if(op.isPresent()) {
			System.out.println(op); // hello
		}
		
		System.out.println("===============");
		Stream<String> stream = Stream.of( "spring", "jquery", "Java","jsp");
		Optional<String> res = stream.findAny();
		// 데이터기 있을때만 실행 하자
		res.ifPresent(i->System.out.println(i));
		System.out.println();
		
		stream = Stream.of( "spring", "jquery", "Java","jsp");
		Optional<String> res2 = stream.findFirst();
		res2.ifPresent(i->System.out.println(i));
		System.out.println();
		
		// allMatch(조건식) : 모두 만족하면 true        = AND
        // anyMatch(조건식) : 하나라도 만족하면 true     = OR
        // noneMatch(조건식) : 모두 만족하지 않으면 true
		stream = Stream.of( "Spring", "Jquery", "java","JSP");
		
		// 모든 문자열이 대문자로 시작하는 지 확인 : allMatch(조건식)
		boolean res3 = stream.allMatch(i -> Character.isUpperCase(i.charAt(0)));
		System.out.println("res3 : " + res3);
		System.out.println();
		
		stream = Stream.of( "Spring", "Jquery", "java","JSP");
		// 하나라도 첫글자가 대문자가 있는 확인 : anyMatch(조건식)
		boolean res4 = stream.anyMatch(i -> Character.isUpperCase(i.charAt(0)));
		System.out.println("res4 : " + res4);
		System.out.println();
		
		stream = Stream.of( "Spring", "Jquery", "java","Jsp");
		// 해당 문자열에 jsp 가 있는지 확인 : anyMatch(조건식)
		boolean res5 = stream.anyMatch(i -> i.equalsIgnoreCase("jsp"));
		System.out.println("res5 : " + res5);
		System.out.println();
		
		stream = Stream.of( "Spring", "Jquery", "java","Jsp");
		// "Python"이 아닌지 확인 : noneMatch(조건식) : 모두 만족하지 않으면 true
		boolean res6 = stream.noneMatch(i -> i.equalsIgnoreCase("Python"));
		System.out.println("res6 : " + res6);
		System.out.println();
	}
}







