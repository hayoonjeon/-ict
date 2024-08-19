package com.ict.day03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// import : 해당 클래스를 사용하기 위해서 패키지 위치를 표시
		//			모든 클래스를 import하는 것은 아님
		// 			java.lang 안에 있는 클래스는 import를 하지 않음
		//  import를 하는 방법 : 1) 클래스 이름에서 Ctrl + space bar
		//					  2) 자동 import ctrl + shift + o(영문자)
		
		//키보드에 입력된 정보를 받아서 저장하자
		Scanner scan = new Scanner(System.in);
		// 이름을 옆으로 찍고 싶으면 ln 삭제하기 
		System.out.print("이름 : ");
		//입력 버퍼에 있는 입력 정보를 String 만든다. (next())
		String name = scan.next();
		System.out.println("입력한 이름 : " + name);
		
		System.out.print("나이 : ");
		//입력버퍼에 있는 입력 정보를 int 만든다 (nextInt())
		int age = scan.nextInt();
		System.out.println("입력한 나이 : " + age);
		
		System.out.print("키 : ");
		//입력버퍼에 있는 입력정보를 double로 만든다 (nextDouble())
		double height = scan.nextDouble();
		System.out.println("입력한 키 : "+height);

		System.out.println("수고하셨습니다.");
		
		
		
	}

}
