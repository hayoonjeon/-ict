package com.ict.day07;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수 : ");
		int cnt = scan.nextInt();
		// 학생의 수를 3을 입력 후 enter 치면 입력버퍼에 있는 3는 cnt에 가고 enter만 남는다.
		// 이 남은 enter를 지은 위해 scan.nextLine();를 한번더 써준다. 
		scan.nextLine();
		
		String[] names = new String[cnt];
		int[] kor = new int[cnt]; 
		int[] eng = new int[cnt]; 
		int[] math = new int[cnt]; 
		int[] sum = new int[cnt];
		double[] avg = new double[cnt];
		String[] hak = new String[cnt];
		int[] rank = new int[cnt]; 
		
		for (int i = 0; i < rank.length; i++) {
			System.out.print("이름, 국어, 영어, 수학 입력 >> ");
			// 띄어쓰기를 하면 띄어쓰기 전까지만 사용하고 탈 출 한다.
			// String str = scan.next();
			
			String str = scan.nextLine();
			System.out.println("str : " + str);
			String[] in  = str.split(" ");
			names[i] = in[0];
			kor[i] = Integer.parseInt(in[1]);
			eng[i] = Integer.parseInt(in[2]);
			math[i] = Integer.parseInt(in[3]);
			
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i] >= 90) {
				hak[i] = "A" ;
			}else if (avg[i] >= 80) {
				hak[i] = "B" ;
			}else if (avg[i] >= 70) {
				hak[i] = "C" ;
			}else {
				hak[i] = "F";
			}
			// 순위의 초기값은 모두 사람이 1 이다.
			rank[i] = 1 ;
		}
		
		// 순위
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		
		// 출력 할때 순위의 정보를 찾아서 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(i+1 == rank[j]) {
					System.out.print(names[i]+"\t");
					System.out.print(sum[i]+"\t");
					System.out.print(avg[i]+"\t");
					System.out.print(hak[i]+"\t");
					System.out.println(rank[i]);
				}
			}
		}
	}
}







































