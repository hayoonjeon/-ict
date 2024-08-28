package com.ict.day22;

// 함수형 인터페이스 : 1개의 추상 메서드를 갖는 인터페이스를 뜻한다.
//                 - 2개의 이상의 추상 메서드가 있으면 함수형 인터페이스는 아니다. 

// 람다식 : 메서드를 간단한 '식'으로 표현 하는 방법
public class Ex02_lamda {
	public static void main(String[] args) {
		// 람다식은 함수형 인터페이스를 사용해야 된다.
		// Object obj =  (a,b) -> a > b ? a : b ; // 람다식 , 익명객체
		
		// 익명객체의 메서드 부분을 표현한 것이 람다식이다.
		// 메서드만 있으며 된다. 하지만 자바는 클래스안에 메서드가 존재 해야 된다.
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b ;
			}
		};
		// 실제 Object에는 max 라는 메서드가 없으므로 max()를 사용할 수 없다.
		// int value = obj.max(3,5);
	}
}
