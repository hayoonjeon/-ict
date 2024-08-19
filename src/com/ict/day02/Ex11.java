package com.ict.day02;

public class Ex11 {

	public static void main(String[] args) {
		//대입연산자 : 데이터나 변수가 가진 데이터를 특정 변수에 저장시킬 때 사용
		//			특정변수 = 데이터(값) 또는 변수
		//참고로 오른쪽 변수는 변수가 저장되는게 아니라 변수가 가진 데이터가 저장됨
		
		// =,+=,-=,*=,/=,%=
		// a=b  >> b를 a변수에 저장한다.
		// a+=b >> a+b의 결과를 a에 저장한다.,,  a= a+b ; 
		// a-=b >> a-b의 결과를 a에 저장한다.,,  a= a-b ; 
		// a*=b >> a*b의 결과를 a에 저장한다.,,  a= a*b ; 
		// a/=b >> a/b의 결과를 a에 저장한다.,,  a= a/b ; 
		// a%=b >> a%b의 결과를 a에 저장한다.,,  a= a%b ;  : 1회성이 아니라 남는다!!!!!! 
		
		int su = 8;
		su += 4; 
		System.out.println("결과 : " + su); //12
		su -= 4; 
		System.out.println("결과 : " + su); // 8
		su *= 4; 
		System.out.println("결과 : " + su); // 32 
		su /= 4; 
		System.out.println("결과 : " + su); // 8
		su %= 4; 
		System.out.println("결과 : " + su); // 0
		
		System.out.println();

		
		  //지역변수는 초기값을 넣어줘야 한다. //잘못된 코딩
		  
		  //int value;
		  
		  //int result = value + 10;
		  
		  //올바른 코딩
		  
		  //int value=0;
		  
		  //int result = value + 10;
		  
		  
		  
		 
		
		
		
		
		
	
	}

}
