package com.ict.day22;

@FunctionalInterface
interface A{
	void m(); // 파라미터X, 리턴값X
}
@FunctionalInterface
interface B{
	void m(String str); // 파라미터O, 리턴값X
}
@FunctionalInterface
interface C{
	String m(); // 파라미터X, 리턴값O
}
@FunctionalInterface
interface D{
	int m(int x, int y); // 파라미터O, 리턴값O
}

public class Ex04_lamda {
	public static void main(String[] args) {
		// 추상메서드를 완성 시키자 
		A a = () -> System.out.println("A");
		
		B b = (str)-> System.out.println("B");
		B b2 = str -> System.out.println("B2");
		
		C c = ()-> "C" ;
		
		D d = (x,y)-> x+y ;
		
		// 실행 방법
		a.m();
		b.m("Hi~~");
		b2.m("Bye~~");

		String k = c.m();
		System.out.println(k);
		
		int k2 = d.m(10, 15);
		System.out.println(k2);
	}
}




