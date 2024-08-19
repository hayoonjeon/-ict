package com.ict.day02;

public class Ex02 {
	
	public static void main(String[] args) {
		//숫자 크기 비교 (char는 숫자로 저장되어서 비교가능)
		//byte<short<char<int<long<float<double
		
		int su1=100;
		long su2=su1; //프로모션
		double su3=su2;//프로모션
		
		char ch1='대';
		int su4=ch1; //프로모션
		
	
		//short보다는 char이 크다
		//short sh1=(short)ch1;
		
		System.out.println("ch1 : "+ch1);
		System.out.println("su4 : "+su4);
		// 복사 : ctrl art  방향키 위 아래
		//옮기는거: art 위 아래 
		//한줄삭제 ctrl d

		// 소수점 둘쨰자리까지만 구하자(* => /)
		double num = 17486.2145;
		num=num*100;
		System.out.println(num);//1748621.45
		//double을 int로 강제형변환하면 소수점이 없어짐
		int num2= (int)num;//1748621
		System.out.println(num2); //1748621

		int num4=num2/100; //17486
		System.out.println(num4);//17486
		
		//num2>>int, 100-> int
		//int와 int 계산하면 결과는 int
		//long과 long이 계산하면 결과는 long
		//int와 long을 계산하면 결과는 long
		
		//float과 long 계산하면 결과는 float
		//double과 long 계산하면 결과는 double
		
		//double과 float을 계산하면 결과는 double 
		
		//예외: 모든 숫자 계산은 int 이상으로 결과를 저장한다.
		//byte와 byte를 계산하면 int로 나온다.
		//short와 short를 계산하면 int로 나온다.
		//byte와 short를 계산하면 int로 나온다.
		
		
		
		
		double num5 = num2/100; //double이라고 17486.21을 예상하지만 정수/정수는 정수 결과로 나온다
		System.out.println(num5);//17486.0   
		
		double num6=num2/100.0; //17486.21 // 실수값을 원하면 반드시 .0이라도 잇어야함. 
		System.out.println(num6);// 17486.21
		
		num = 17486.2145;
		double num7=num/10;      //실수/정수 여서 실수값으로 나옴 
		System.out.println(num7);//1748.6214499999999
		int num8= (int)(num7)*10;  //(강제 정수 형변환)실수/정수이므로  정수가 나옴 . 순서는 ()()먼저 하고 곱하기 10  ;
		System.out.println(num8);
		
		
	
	
		

		
		
		
		
	}

}
