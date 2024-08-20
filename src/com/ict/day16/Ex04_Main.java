package com.ict.day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Ex04를 담을 set 컬렉션 만들자 
		HashSet<Ex04> set1 = new HashSet<Ex04>();
		esc: while(true) {
			try {
				System.out.print("이름 : ");
				String name = scan.next();
				
				System.out.print("국어 : ");
				int kor = scan.nextInt();
				
				System.out.print("영어 : ");
				int eng = scan.nextInt();
				
				System.out.print("수학 : ");
				int math = scan.nextInt();

				Ex04 p = new Ex04(name, kor, eng, math);
				// 객체 생성해서 set 컬렉션에 추가 하자
				set1.add(p);
			} catch (Exception e) {
				System.out.println("점수는 숫자로 넣어주세요");
				scan.nextLine();
				continue esc;
			}
			
			while(true) {
				System.out.print("계속할까요(y/n)? ");
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
		}
		// set1 컬렉션 출력
		for (Ex04 k : set1) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.println(k.getHak());
		}
		System.out.println();
		
		Iterator<Ex04> it = set1.iterator();
		while (it.hasNext()) {
			Ex04 k = it.next();
			System.out.print(k.getName()+"\t");
			System.out.print(k.getSum()+"\t");
			System.out.print(k.getAvg()+"\t");
			System.out.println(k.getHak());
		}
	}
}













