package com.ict.day02;

public class Ex01 {

	public static void main(String[] args) {
		//실수 : 소숫점이 있는 숫자
		// 		float<double  (기본)
		
		//float 는 숫자 뒤에 F,f를 붙인다.(생략불가)
		float f1=3254.125f; //실수는 기본값이 더블이라 float에 안들어가므로 f를 뒤에 붙여줌 
		
		float f2;
		//float = int>> 프로모션(자동형변환) : 작은 자료형이 큰 자료형으로 변환(자동) //정수라서 실수 float에 바로 들어감
		f2=124;
		System.out.println(f2);
		
		float f3;
		//float=double > 디모션(강제 형변환) : 큰 자료형을 작은 자료형으로 변환(강제) : 정보 손실이 있을 수도 있다
		//(왼쪽자료형)(강제변환할 데이터)
		f3=(float)(123.12);
		System.out.println(f3);
		
		double d1=123.1232;
		double d2=123.11f; //double =float
		
		System.out.println(d1);
		System.out.println(d2);
		
		
	}
}
