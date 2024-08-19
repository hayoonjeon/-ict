package com.ict.day01;

public class Ex02 {

	public static void main(String[] args) {
		//주석 : 컴파일러가 무시하고 지나가는 줄
		//      개발자가 자신이나 다른 개발자에게 멘트를 남길 때 사용
		
		//기본 자료형 : 자바 컴파일러에 의해서 구분되는 데이터의 종류(타입)
		//			 논리형, 문자형,숫자형(정수형,실수형)
		//참조 자료형 : 클래스를 자료형으로 사용
		
		// 논리형 : boolean, 데이터 범위 : true, false(둘 중 하나만)
		
		// 선언 : res에 boolean형의 데이터를 저장할 수 있는 공간을 만듦
		//자료형 키워드 이름;
		boolean res ;
		
		//저장 : res 라는 저장 공간에 true 라는 데이터를 저장)(대입,=)
		//'변수 = 데이터' 구조 >>데이터를 변수에 저장한다.
		res=true;
		//변수를 호출하면 변수가 가지고 있는 데이터가 온다.
		System.out.println(res);
		
		// 클래스 안에서는 같은 이름으로 선언을 두 번 할 수 없다.
		//boolean res ;
		res = false;
		
	
	System.out.println(res);
 
	boolean res2 = true;
	System.out.println(res2);
	
	
		}
	}

