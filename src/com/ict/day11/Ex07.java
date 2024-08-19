package com.ict.day11;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	esc :	while(true) {
			int computer = (int)(Math.random()*13)+1;//0.0~1.0미만 난수   0~12; -> 1~13
			System.out.println("1. 높음 2.낮음>>");
			int user = scan.nextInt();
			String msg = "";
			
			if(user==1) {
			if(computer>=1&&computer<=6) {
				msg = "틀림";
			}else if(computer>=8&&computer<=13){
				msg = "맞음";
			}else
				msg = "비김";
			}else if(user==2) {
			if(computer>=1&&computer<=6) {
					msg = "맞음";
			}else if(computer>=8&&computer<=13){
					msg = "틀림";
			}else
					msg = "비김";
			}
			
			System.out.println("컴퓨터숫자 : " + computer);
			System.out.println("결과 : " + msg);
		
		
		
		
			
		while(true) {
			System.out.println("계속할까요? (y/n)");
		String str = scan.next();
		if (str.equalsIgnoreCase("y")) {
			continue esc;
		}else if (str.equalsIgnoreCase("n")) {
			break esc;
		}else
			System.out.println("y와 n 중 하나만 입력하세요");
			continue;
			
			
			
			
		}
		
		
		
		}

	System.out.println("수고하셨습니다.");
	}

}
