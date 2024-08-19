package com.ict.day10;

public class Ex11 {

	//매개변수 (파라미터) 메서드 선언시 저으이되는 변수,메소드 호출할때 전달될 데이터
//						메서드를 호출할 떄 전달될 데이터를 가리키는 입력슬롯과 같은역할	
	//인자  : 실제로 메서드를 호출할때 전달되는 값, 매개변수에 저장되는 실체적인 데이터
		
	
	String name ;
	int sum;
	double avg;
	String hak;
	
	public void play01(String k1) {
		name = k1;
		
	}
	
	public void play02(int k1, int k2, int k3) {
		
		sum = k1+k2+k3;
		//메소드는 다른 메소드를 호출할 수 있다.
		play03();
		play04();
		play05();
		
	}
	
	public void play03() {
		avg = (int)(sum/3.0*10)/10.0;
		
	}
	public void play04() {
		
		if(avg>=90) {
			hak="A학점";
		}else if(avg>=80) {
			hak="A학점";
		}else if(avg>=70) {
			hak="A학점";
		}else {
			hak="A학점";
		}
		
	}
	
	public void play05() {
		
		System.out.println("이름 : "+ name);
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : "+ avg);
		System.out.println("학점 : "+ hak);
	}
		
		
	
}
