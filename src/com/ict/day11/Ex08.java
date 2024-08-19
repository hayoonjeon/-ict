package com.ict.day11;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//가위, 바위, 보
		
		
	esc:	while (true) {
			int computer = (int)(Math.random()*3);//0~2   0 가위 1 바위 2 보 
			
			System.out.println("선택하세요");
			System.out.println("1.가위, 2.바위, 3. 보>>");
			int user = scan.nextInt();
			String result = "";
			if(user==1) {
				if(computer ==0) {
				result = "비김";
				}else if (computer==1) {
					result = "짐";
				}else if (computer==2) {
					result = "이김";
				}
				
				
				
			}else if (user==2) {
				if(computer ==0) {
					result = "이김";
					}else if (computer==1) {
						result = "비김";
					}else if (computer==2) {
						result = "짐";
					}
				
			}else if (user==3) {
				if(computer ==0) {
					result = "짐";
					}else if (computer==1) {
						result = "이김";
					}else if (computer==2) {
						result = "비김";
					}
				
			}else {
				System.out.println("1,2,3중 하나만 선택하세요");
			continue;
			}
			
			System.out.println("결과 : " + result);
			
			while (true) {
				System.out.println("계속할까요? y/n ");
				String answer= scan.next();
				
				if (answer.equalsIgnoreCase("y")) {
					continue esc;
				}else if (answer.equalsIgnoreCase("n")) {
					break esc;
				}else {
					
					System.out.println("y 또는 n을 입력해주세요");
					continue;

				}
			}
			
			
			
			
		}
	

		
		System.out.println("수고하셨습니다.");
		
		
		
		
		
	}
}
