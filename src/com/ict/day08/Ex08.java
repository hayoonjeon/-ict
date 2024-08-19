package com.ict.day08;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// Ex07를 Scanner를 이용해서 만들자 (단, id는 중복체크하자)
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		String[][] members = new String[cnt][5];
		for (int i = 0; i < members.length; i++) {
			String[] p = new String[5];
			
			System.out.print("번호 : ");
			p[0] = scan.next();
			
			System.out.print("아이디 : ");
			String userId = scan.next();
			
			// 기존에 가지고 있는 아이디와 중복체크하자 
			boolean idchk = false ;
			for (int j = 0; j <i; j++) {
				if(userId.equals(members[j][1])) {
					idchk = true;
					break;
				}
			}
			// 중복 체크
			if(idchk) {
				System.out.println("아이디 중복");
				i--;
				continue;
			}
			p[1]=userId;
			
			System.out.print("패스워드 : ");
			p[2] = scan.next();
			
			System.out.print("이름 : ");
			p[3] = scan.next();
			
			System.out.print("주소 : ");
			p[4] = scan.next();
			
			members[i] = p ;
		}
		
		System.out.print("당신의 아이디 : "); 
		String u_id = scan.next();
		
		System.out.print("당신의 패스워드 : "); 
		String u_pw = scan.next();
		
		boolean logchk = false;
		for (int i = 0; i < members.length; i++) {
			if(u_id.equals(members[i][1])) {
				if(u_pw.equals(members[i][2])) {
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










