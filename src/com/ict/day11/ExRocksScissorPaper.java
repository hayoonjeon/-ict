package com.ict.day11;

import java.util.Random;
import java.util.Scanner;

public class ExRocksScissorPaper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Random random = new Random();
	
		
		
	esc:while (true) {
		
			int num = random.nextInt(3)+1;
			
			String str = "";
			String scissor = "가위";
			String rock = "바위";
			String paper = "보";
			
			if (num==1) {
				str = scissor;
			} else if (num==2) {
				str = rock;
			}else
				str = paper;
			
		
		System.out.println("가위바위보 내기>> 1)가위, 2)바위, 3)보");
		int input = scan.nextInt();
		if(input>=1&&input<=3) {
			
		}else {
			System.out.println("잘못입력하셨습니다.");
		continue;
		}
		System.out.println("컴퓨터 : " + str);
		if ((input-1)%3-(num-1)%3==1) {
			System.out.println("이겼습니다.");
		}else if ((input-1)%3-(num-1)%3==0) {
			System.out.println("비겼습니다.");
		}else 
			System.out.println("졌습니다.");
		
		System.out.println("계속하시겠습니까? 1.yes,  2.no");
		int input2 = scan.nextInt();
		if (input2==1) {
			continue esc;
		}
		break;

	
	}
		
			
		
		
		
		}
	
}
	

