package com.ict.day05;

public class Ex06 {

	public static void main(String[] args) {
		// break와 continue
		//break : switch문이나 반복문을 현재 위치에 있는 반복문(보통은 for문)을 탈출할 때 사용하는 예약어 
		//continue : 탈출이 아니다. 다음 반복문을 실행하기 위해 continue 문 아래를 무시하고 다음 회차를 진행하는 예약어
		//			(for -> 증감식, while -> 조건식으로 이동)
		//보통 if문과 같이 씀
		
		//1부터 10까지 for문으로 출력 
		
		
		
		for (int i = 0; i < 11; i++) {
		
			System.out.print(i+" ");
		}
			System.out.println();
		
		//i가  6일떄 브레이크
		
		for (int i = 0; i < 11; i++) {
			if (i==6) {
				break;
			}
			System.out.print(i+" ");
		
		}
		System.out.println();

		//i가 6일떄 컨티뉴 
		
		for (int i = 0; i < 11; i++) {
			if (i==6) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();

		
		
		//1부터 10까지 홀수 출력 
		for (int i = 0; i < 11; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.print(i);
		}
		System.out.println();
	}

}
