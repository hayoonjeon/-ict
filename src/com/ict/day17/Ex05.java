package com.ict.day17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 로그인 
		Map<String, String> map = new HashMap<String, String>();
		// 아이디, 비밀번호
		map.put("hong", "1212");
		map.put("park", "p1212");
		map.put("kang", "k1212");
		map.put("kim", "1212");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = scan.next();
			
			System.out.print("비밀번호 : ");
			String pwd = scan.next();
			
			// containsKey(Object key) : 인자로 받은 키가 해당 map에 존재하냐?
			if(map.containsKey(id)) {
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}














