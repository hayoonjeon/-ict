package com.ict.day03;

public class Ex07 {
	
	public static void main(String[] args) {
		//삼항연산자(조건) : 조건이 참일때와 거짓일 때를 구분해서 일처리하자 
		//형식) 자료형 변수 = 조건식? 참일 때 실행할 문장;  :  거짓일 때 실행할 문장; 
		//	변수 자료형 = 참일때 실행할 문장의 결과 자료형 = 거짓일 때 실행할 문장의 결과 자료형
		
		//int k1이 홀수인지 짝수인지 판별하자.
		//힌트) 어떤 수를 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
		
		int k1=8;
		String str = (k1%2==0)? "짝수"   : "홀수"  ;
		
		System.out.println("결과 : "+str);
		
		//int k2가 60이상이면 합격, 아니면 불합격 
		
		int k2 = 60;
		str=(k2>=60)? "합격"    : "불합격"    ;  
		
		System.out.println("결과 : "+str);
	
		//int k3가 1이면 가격을 10% 할인해줌 
		
		int k3 = 1;
		int pri = 1300;
		int res1=(k3==1)? (int)(0.9*pri) : pri ;
		
		System.out.println("결과 : "+res1+"원");
		
		
		//char k4가 대문자인지, 대문자가 아닌지 판별하자
		char k4='d';
		str = (k4>='A' && k4<='Z')? "대문자" : "대문자 아님";
		System.out.println("결과 : "+str);
		
		//근무시간이 8시간까지는 시간당 9860원이다.
		// 8시간 초과하면 초과한 시간만큼 1.5배 지급한다.
		//현재 내가 근무한 시간이 10시간이면 얼마를 받아야 하는가?
		
		int time = 10;
		int dan = 9860;
		
		int res4 =(time<=8)? (dan*time) : (dan*8)+(int)(1.5*dan*(time-8));   //왜 안되는지? 
		System.out.println("결과 : "+res4);

	
		
		
		
		
		
	}

}
