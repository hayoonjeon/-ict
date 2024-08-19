package com.ict.day08;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		double[][]  arr = new double[cnt][8] ;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호 : ");
			int idx = scan.nextInt();
			
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학 : ");
			int math = scan.nextInt();
			
			int sum = kor + eng + math ;
			double avg = (int)(sum/3.0 *10) / 10.0;
			char hak = 'F';
			if(avg>=90) {
				hak = 'A';
			}else if(avg>=80) {
				hak = 'B';
			}else if(avg>=70) {
				hak = 'C';
			}else {
				hak = 'F';
			}
			
			int rank = 1 ;
			
			double[] p = {idx, kor, eng, math, sum, avg, hak, rank};
			arr[i] = p ;			
		}
		
		// 순위
		
		// 정렬
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 6) {
					System.out.print((char)(arr[i][j])+"\t");
				}else if(j==5) {
					System.out.print(arr[i][j]+"\t");
				}else {
					System.out.print((int)(arr[i][j])+"\t");
				}
			}
				System.out.println();
		}
	}
}




