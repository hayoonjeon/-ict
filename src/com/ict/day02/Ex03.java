package com.ict.day02;

public class Ex03 {
	public static void main(String[] args) {
		//기본 자료형은 아니지만 기본 자료형처럼 사용하는 String
		//String 클래스는 기본자료형이 아니라 클래스이므로 참조자료형이다.
		//기본자료형처럼 사용한다.
		//반드시 쌍따옴표를 사용한다. ("가","adsf","1")
		
		int age = 18;
		String str = "홍길동";
		
		System.out.println(age);
		System.out.println(str);
		
		//String+ 연산 : 실제 덧셈 연산을 하는게 아니라 
		//				문자열과 문자열, 문자열과 숫자를 이어 붙이는 역할을 한다.
		//				String이 +연산을 하면 결과는 String이다.
		
		String s1 = "10";
		int s2 = 10;
		
		System.out.println(s1 + 10); //String과 숫자가 붙어 String 즉 1010 
		System.out.println(s2 + 10); //20 숫자열고 ㅏ숫자열 
		
		int su1 = 20;
		int su2 = 4;
		System.out.println(su1 + su2); //24
		System.out.println("합계 : " + su1 + su2); //합계 : 204
		
		int su3 = su1 + su2;
		System.out.println("합계 : " + su3); 
		System.out.println("합계 : " + (su1 + su2));
		
	}

}
