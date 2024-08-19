package com.ict.day10;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex13 bob = new Ex13();
		
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("국어를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학을 입력하세요");
		int math = scan.nextInt();
		
		int sum = bob.getSum(kor, eng, math);
		double avg = bob.getAvg(sum);
		String hak = bob.getHak(avg);
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(hak);
	
		
		
		
		
		
		
		
		
		
		
	}
}
