package com.ict.day08;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		String[][] members = {
			{"1", "admin", "a111", "어드민", "서울"},	
			{"2", "park", "p111", "박길동", "경기도"},	
			{"3", "kang", "k111", "강길동", "제주도"},	
			{"4", "goh", "g111", "고길동", "충청도"},	
			{"5", "kim", "k111", "김길동", "강원도"}	
		};
		Scanner scan = new Scanner(System.in);
		// 아이디 입력
		System.out.print("아이디 : ");
		String userId = scan.next();
		
		// 패스워드 입력
		System.out.print("패스워드 : ");
		String userPw = scan.next();
		
		boolean logchk = false ;
		for (int i = 0; i < members.length; i++) {
			if(userId.equals(members[i][1])) {
				if(userPw.equals(members[i][2])) {
					logchk = true;
				}
			}
		}
		if(logchk) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디나 패스워드가 일치하지 않습니다.");
		}
	}
}
