package com.ict.day08;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		String[][] arr = new String[cnt][8];
		
		for (int i = 0; i < arr.length; i++) {
			
			String[] p = new String[8];
			
			System.out.print("이름 : ");
			p[0] = scan.next();
			
			System.out.print("국어 : ");
			p[1] = scan.next();
			
			System.out.print("영어 : ");
			p[2] = scan.next();
			
			System.out.print("수학 : ");
			p[3] = scan.next();
			
			// 받은 국어,영어,수학(String)을 int 변경해서 저장하자 
			int kor = Integer.parseInt(p[1]);
			int eng = Integer.parseInt(p[2]);
			int math = Integer.parseInt(p[3]);
			int sum = kor + eng + math ;
			
			// int를 String으로 변경해서 배열에 저장
			// p[4] = sum + "";
			p[4] = String.valueOf(sum);  
			
			double avg = (int)(sum/3.0 * 10) /10.0;
			p[5] = String.valueOf(avg);
			
			if(avg>=90) {
				p[6] = "A학점";
			}else if(avg>=80) {
				p[6] = "B학점";
			}else if(avg>=70) {
				p[6] = "C학점";
			}else {
				p[6] = "F학점";
			}
			
			p[7] = "1";
			arr[i] = p ;
			
		}
		// 순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][4]) < Integer.parseInt(arr[j][4])) {
					int r = Integer.parseInt(arr[i][7]) ;
					arr[i][7] = String.valueOf(++r);
				}
			}
		}
		// 정렬
		// 임시저장
		String[] tmp = new String[8];
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(Integer.parseInt(arr[i][7]) > Integer.parseInt(arr[j][7])) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==1 || j==2 || j==3) {
					continue;
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

	}
}









