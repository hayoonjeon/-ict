package com.ict.day08;

public class Ex02 {
	public static void main(String[] args) {
		// 가변길이 : 1차원 배열이 가지고 있는 각각의 배열의 크기가 다른 배열을 의미
		// 1. 선언 : 자료형[][] 이름;
		int[][] su ;
		
		// 2. 생성 : 이름 = new 자료형[1차원 배열의 크기][]
		su = new int[3][];
		
		// 3. 데이터 저장(고정길이 처럼 데이터 입력하면 오류)
		// su[0][0] = 10 ;
		// su[0][1] = 10 ;
		
		// su[1][0] = 10 ;
		// su[1][1] = 10 ;

		// su[2][0] = 10 ;
		// su[2][1] = 10 ;
		
		// 1차원 배열 만들어서 연결하자
		int[] k1 = {1,2,3};
		int[] k2 = {10,20};
		int[] k3 = {100,200,300,400};
		
		// 1차원배열과 2차원 배열 연결
		su[0] = k1 ;
		su[1] = k2 ;
		su[2] = k3 ;
		
		// 출력하기
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}

	}
}
