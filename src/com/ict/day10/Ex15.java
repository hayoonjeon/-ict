package com.ict.day10;

public class Ex15 {

	//매개변수 (파라미터) 메서드 선언시 저으이되는 변수,메소드 호출할때 전달될 데이터
//						메서드를 호출할 떄 전달될 데이터를 가리키는 입력슬롯과 같은역할	
	//인자  : 실제로 메서드를 호출할때 전달되는 값, 매개변수에 저장되는 실체적인 데이터
		
	
	private String name = "홍길동";
	//private 은 외부에서 접근할 수 없다.
	private static int sum = 297;
	private double avg;
	private String hak;
	
	String addr = "김길동";
	static int total = 135;
	
	//private 변수를 위해서 메서드이용해 데이터접근하기 
	public String haYoon() {
		
		return name;
	}
	
	public int haYoon2() {
		
		return sum;
	}
	
	public String haYoon3(String k1) {
		
		name = k1;
		
		return k1;
	}
		
		public int haYoon4(int k1) {
			
			sum = k1;
			return k1;
			
	}
	
	
	//private 변수를 위해 메서드를 이용해 데이터 변경하기 
	
		
	
}
