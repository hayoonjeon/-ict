package com.ict.day07;

import java.util.Scanner;

public class Ex99 {

	public static void main(String[] args) {
//학생수 받고 
		// 이름, 국어,영어, 수학만 받고  총점, 평균,학점, 순위 (오름차순까지) 가자. 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생수 : ");
		int num = scan.nextInt();
		double[][] str = new double[num][8];
		
		for (int i = 0; i < str.length; i++) { //for문으로 이름,등등 적을거 반복시켜야 함 
			System.out.println("이름");
			int name = scan.nextInt();
			
			System.out.println("국어");
			int kor = scan.nextInt();
			
			System.out.println("영어");
			int eng = scan.nextInt();
			
			System.out.println("수학");
			int math = scan.nextInt();
			
			int sum = kor+eng+math;
			
			double avg = (int)(sum/3.0*10)/10.0;
			char hak = 'F';
			if (avg>=90) {
				 hak = 'A';
			} else if (avg>=80) {
				 hak = 'B';
			} else if (avg>=70) {
				 hak = 'C';
			} else {
				 hak = 'F';
			}
			
			int rank = 1;

			
			double[] p = {name,sum,avg,hak,rank};
			str[i]=p;
		
			
			
		}
		
		// 데이터 수는 8가지로 정해져있다. 이름 국
		
		//순위정하기
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i][1]<str[j][1]) {
					str[i][4]++;
				}
			}
		}
		
		//정렬 : 순서대로 정렬 : 임시저장 tmp 사용하자 
		
		double [] tmp = new double [4];
		for (int i = 0; i < str.length-1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i][4]>str[j][4]) {
					tmp=str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				if (j==2) {
					System.out.print(str[i][j]+"\t");
				}else
				System.out.print((int)(str[i][j])+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}




















