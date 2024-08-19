package com.ict.day02;

public class Ex04 {
	public static void main(String[] args) {
		//산술연산자 : +, -, *(곱하기), /(나누기), %(나머지)
		//연산대상 : 숫자(byte, short, char, int, long, float, double)
		
		int su1 = 9;
		int su2 = 4;
		int result = 0; //결과를 저장하는 변수 
		
		
		result = su1 + su2;
		System.out.println(su1 + " + " + su2 + " = " + result);//9 + 4 = 13
		
		result = su1 - su2;
		System.out.println(su1 + " - " + su2 + " = " + result);//9 - 4 = 5
		
		result = su1 * su2;
		System.out.println(su1 + " * " + su2 + " = " + result);//9 * 4 = 36
		
		//정수/정수 결과가 정수  >> 몫 구해짐 
		result = su1 / su2;
		System.out.println(su1 + " / " + su2 + " = " + result);//9 / 4 = 2
		
		double result2 = su1 / su2;
		System.out.println(su1 + " / " + su2 + " = " + result2);//9 / 4 = 2.0
		
		//double result3 = sul / su2 * 1.0;
		double result3 = su1 / (double)su2;
		System.out.println(su1 + " / " + su2 + " = " + result3);//9 / 4 =2.25 
		
		
		result = su1 % su2;
		System.out.println(su1 + " % " + su2 + " = " + result);//9 % 4 = 1
		
		
	}

}
