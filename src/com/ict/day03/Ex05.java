package com.ict.day03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//1000초는 몇시간 몇분 몇초일까요?
		
		
		Scanner scan = new Scanner(System.in);

		
		System.out.print("초를 입력하세요 : ");
		int time = scan.nextInt();
	
		int hour = 0;
		int min = 0;
		int sec = 0;
		int result = 0; //나머지 저장변수
		
		hour = time/(60*60);
		result = time%(60*60);
		min = result/60;
		sec = result%60;
		
		
		
		
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간 ");
		System.out.print(min+"분 ");
		System.out.print(sec+"초입니다.");
		
		

	}

}
