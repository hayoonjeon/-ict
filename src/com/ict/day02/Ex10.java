package com.ict.day02;

public class Ex10 {
	public static void main(String[] args) {
		//비교 연산자 : >,<,<=,>=,==,!=
		//비교 연산자의 대상 : 숫자 (정수형, 실수형, 문자형)
		//비교연산자의 결과 : boolean(논리형)
		//논리형이면 보통 조건식에 사용된다
		
		int su1 =80;
		int su2 = 80;
		boolean res = su1 > su2;
		System.out.println("결과 : " + res);
		
		double su3 = 91.0;
		double su4 = 89.9;
		
		res = su3>su4;
		System.out.println("결과 : " + res);
		
		//정수값과 실수값의 실제 값  비교
		
		res = su1 > su4 ;
		
		System.out.println("결과 : "+ res);
		
		
		char su5 = 'a';
		char su6 = 'A';
		char su7 = 'b';
		
		res = su5 > su6 ;
		System.out.println("결과 : "+ res);
		
		res = su5 > su7 ;
		System.out.println("결과 : "+ res);
		
		//char를 int형으로 바꾸면 숫자로 알 수 있다.
		
		System.out.println("a :" + (int)su5);
		System.out.println("A :" + (int)su6);
		System.out.println("b :" + (int)su7);
		
	
		
		
		
	
		
		
	}
}
