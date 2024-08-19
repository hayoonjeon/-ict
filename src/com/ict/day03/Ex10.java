package com.ict.day03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//int k1 이 90이상이면  A학점 , 80이면 비 70 씨 나머지 에프 
		
		System.out.print("점수 입력 :");
		int k1 = scan.nextInt();
		
		
		
		String str = (k1>=90)? "A" : (k1>=80)? "B" : 
			(k1>=70)? "C" : "F";
		
		System.out.println("당신의 학점 : "+str);
		
		
		
		
		// char k2 가 대문자인지 소문자인지, 숫자인지, 기타문자인지 판별하자

		
		char k2 = 'A';
		
		
		
		str = (k2>='A'&&k2<='Z')? "대문자"
			: (k2>='a'&&k2<='z')? "소문자"
			: (k2>='0'&&k2<='9')? "숫자" : "기타문자";
		
		System.out.println("문자의 종류 : "+str);
		
		    
			
		
		
	}

}
