package com.ict.day11;

public class Ex03 {

	//오버로딩(중복정의) : 같은 클래스 안에서 같은 이름의 메서드를 여러개 정의 하는 것.
	//				  단, 인자의 자료형이나 인자의 수가 달라야 한다.
	
	public int plus(int s1, int s2) {
		int sum = s1 + s2;
		return sum;
	}
	public int plus(int s1, double s2) {
		int sum = s1 + (int)s2;
		return sum;
	}
	public int plus(double s1, int s2) {
		int sum = (int)s1 + s2;
		return sum;
	}
	public int plus(double s1, double s2) {
		int sum = (int)s1 + (int)s2;
		return sum;
	}
	public int plus(String s1, String s2) {
		//파싱해서 직접 계산 
		int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		
		//다른방법 : 메소드는 다른 메소드를 호출할 수 있다.
		plus(Integer.parseInt(s1),Integer.parseInt(s2));
		return sum;
	}

	
	
}
