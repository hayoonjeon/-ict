package com.ict.day12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int strike = 0; // 스트라이크갯수 초기화;
		int ball = 0; // 볼 갯수 초기화

		// 컴퓨터 값 배열 result에 저장 완료

		// 사용자로부터 숫자 입력받아서 대결

	esc:	while (true) {

			Ready ex = new Ready(); // Ready클래스를 ex라고 짧게 지칭.
			int[] com = ex.getComputer();

		
			
		
			System.out.println("첫번째 숫자를 입력하십시오");
			int input1 = scan.nextInt();
			while (true) {
			System.out.println("두번째 숫자를 입력하십시오");
			int input2 = scan.nextInt();
			if (input2==input1) {
				System.out.println("서로 다른 수를 입력하세요");
				continue;
			}
			while(true) {
			System.out.println("세번째 숫자를 입력하십시오");
			int input3 = scan.nextInt();
			if(input3==input2||input3==input1) {
				System.out.println("서로 다른 수를 입력하세요");
				continue;
			}
					//입력한수를 input 1,2,3
			int[] user = { input1, input2, input3 };
					// 같은자리수, 같은 숫자면 스트라이크
			for (int i = 0; i < user.length; i++) {
				if (user[i] == com[i]) {
					strike++;
				}
			}
					//다른자리수, 같은숫자면 스트라이크
			for (int i = 0; i < user.length; i++) {
				for (int j = 0; j < user.length; j++) {
					if (i != j && user[i] == com[j]) {
						ball++;
					}
				}

			}

			System.out.println("내숫자 : " + Arrays.toString(user));
			System.out.println("컴퓨터숫자 :" + Arrays.toString(com));

			System.out.println("결과 :" + strike + "스트라이크," + ball + "볼,");
			if (strike >= 3) {
				System.out.println("삼진아웃\n수고하셨습니다.");
				strike = 0;
				ball = 0;
				break esc ;

			}
			
			if(ball>=4) {
				
				System.out.println("볼넷.패배");
				strike = 0;
				ball = 0;
				break esc;
				
			}
			
			
			
			continue esc;
			
		
			}//3번쨰 수가 중복일떄 대비한 while
			} // 두번째 수가 중복일떄 단위의 while 
		} // 경기 끝까지 계속 while로 진행하는 가장 큰 단위

	}
}
