package com.ict.day15;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		esc:while(true) {
			try {
				System.out.print("숫자입력 : ");
				int su = scan.nextInt();
				
				String str = "";
				if(su%2 == 0) {
					str = "짝수";
				}else {
					str = "홀수";
				}
				System.out.println(su + "는 " + str + "입니다.");
				
				while(true) {
					System.out.print("계속할까요(y/n) >> ");
					String msg = scan.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						System.out.println("제대로 입력하세요");
						continue;
					}
				}
			} catch (Exception e) {
				System.out.println("문자를 입력하지 마세요");
				scan.nextLine();
			}
		}
		System.out.println("수고하셨습니다.");
	}
}
