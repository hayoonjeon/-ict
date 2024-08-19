package com.ict.day03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 숫자 2개를 받아 사칙연산 결과 나오게 하기. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 :");
		int number1 = scan.nextInt();
		System.out.print("두번째 수 :");
		int number2 = scan.nextInt();
		
		int plus = number1+number2;
		int minus = number1-number2;
		int gob = number1*number2;
		double nan = ((int)(number1*1.0/number2*10))/10.0;
	
		
		System.out.println(number1+"+"+number2+"="+plus);
		System.out.println(number1+"-"+number2+"="+minus);
		System.out.println(number1+"*"+number2+"="+gob);
		System.out.println(number1+"/"+number2+"="+nan);
		
		
		
		
		//결과 보기 
		

	}

}
