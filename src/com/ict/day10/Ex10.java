package com.ict.day10;

import java.util.Scanner;

public class Ex10 {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	Ex09 t = new Ex09();
	
	System.out.println("이름입력하세요");
	String name = scan.next();
	
	System.out.println("국어");
	int kor = scan.nextInt();
	System.out.println("수학");
	int math = scan.nextInt();
	System.out.println("영어");
	int eng = scan.nextInt();
	
	t.play01(name);
	t.play02(kor,math,eng);
	t.play03();
	t.play04();
	t.play05();
	System.out.println();
	
	Ex11 test2 = new Ex11();
	test2.play01(name);
	test2.play02(kor, math, eng);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
