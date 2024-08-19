package com.ict.day05;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
	
	Scanner scan =new Scanner(System.in);
	// 이름, 국어, 수학, 영어,총점,평균 ,초기화 
	
	
	while (true) {
		System.out.print("학년 : ");
		int cnt = scan.nextInt();
		//입력버퍼에 있는 엔터문자를 삭제(꺼낸다)하기 위해서
		scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("국어점수 : ");
		int kor = scan.nextInt();
		System.out.print("수학점수 : ");
		int math = scan.nextInt();
		System.out.print("영어점수 : ");
		int eng = scan.nextInt();
		
		int sum = kor + math + eng ;
		double avg = (int)(sum/3.0*10)/10.0;
		
		//학점
		String hak = "";
		if (avg>=90) {
			hak ="A학점";
		} else if (avg>=80) {
			hak ="B학점";
		} else if (avg>=70) {
			hak ="C학점";
		} else  {
			hak ="F학점";
		}
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		
		System.out.println("계속할까요? 1.yes, 2.no");
		int input = scan.nextInt();
		
		if (input==2) {
			break;
		
		}

	
	
	
		
		}
	}
}
