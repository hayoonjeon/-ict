package com.ict.day22;

// 함수형 인터페이스를 만들자
// @FunctionalInterface 사용하면 반드시 추상메서드 하나만 
//  2개이상이면 오류 발생 
@FunctionalInterface
interface MyFunction{
	public int max(int a, int b);
}

public class Ex03_lamda {
	public static void main(String[] args) {
		// 익명객체
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return  a>b ? a : b ;
			}
		};
		int result = f.max(3, 5);
		System.out.println(result);
		System.out.println("==============");
		
		MyFunction f2 = (a, b) -> a>b ? a : b ;
		int result2 = f2.max(5, 3);
		System.out.println(result2);
	}
}






