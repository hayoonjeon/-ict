package com.ict.day02;

public class Ex05 {
	public static void main(String[] args) {
		// 이름 홍길동인 사람의 성적이 
		//국어 90, 영어 80, 수학 80 이다. 
		//총점과 평균을 구하시오
		//화면의 출력은 이름, 총점, 평균(소수점 첫째자리까지만 구하자)만 하자
		
		
		
		//1. 데이터 정보를 저장
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		
		
		int sum = kor + eng + math;
		
		double avg = sum/3.0; // 83.333333

		avg = (int)(avg*10)/10.0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//2. 처리 = 비즈니스 로직
	
		//int sum = kor+eng+math; // sum = 250
		
		
		
		//double avg = sum/3.0;
		
		//avg = (int)(avg*10)/10.0; // 이거 굳 변수 한번 더 
	
	
		
		//double avg1 = (int)(sum/0.3)/10.0; //나 연습한거(밑 줄인거)  
				
				
		//double avr = (int)(sum/0.03)/100.0;  //avr = ((int)(833.33333))/10.0  =83.3 //연습한거 
		
		
		
		
		
		//3. 화면 출력 
		
		//  이름, 총점과 평균(소수점 첫째자리)
		
		
		
		
		
		
		System.out.println("이름 : " + name + " 님");
		System.out.println("총점 : " + sum + " 점");
		System.out.println("평균 : " + avg + " 점");
		
			
		
	
		
	}
}
