package com.ict.day08;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int cnt = scan.nextInt();
		
		double[][]  arr = new double[cnt][8] ;
		
		for (int i = 0; i < arr.length; i++) {
			// 가장 많이 하는 패턴
			double[] p = new double[8];
			
			System.out.print("번호 : ");
			p[0] = scan.nextInt();
			
			System.out.print("국어 : ");
			p[1] = scan.nextInt();
			
			System.out.print("영어 : ");
			p[2] = scan.nextInt();
			
			System.out.print("수학 : ");
			p[3] = scan.nextInt();
			
			p[4] = p[1] + p[2] + p[3] ;
			p[5] = (int)(p[4]/3.0 *10) / 10.0;
			if(p[5]>=90) {
				p[6] = 'A';
			}else if(p[5]>=80) {
				p[6] = 'B';
			}else if(p[5]>=70) {
				p[6] = 'C';
			}else {
				p[6] = 'F';
			}
			
			p[7] = 1 ;
			
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




