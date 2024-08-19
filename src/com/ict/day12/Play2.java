package com.ict.day12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Play2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int strike = 0; // 스트라이크갯수 초기화;
		int ball = 0; // 볼 갯수 초기화
		int out = 0;
		boolean chk = true;

		// 컴퓨터 값 배열 result에 저장 완료

		// 사용자로부터 숫자 입력받아서 대결

		while (true) {

			Ready ex = new Ready(); // Ready클래스를 ex라고 짧게 지칭.
			int[] com = ex.getComputer();

			System.out.println("첫번째 숫자를 입력하십시오");
			int input1 = scan.nextInt();

			System.out.println("두번째 숫자를 입력하십시오");
			int input2 = scan.nextInt();
			if (input2 == input1) {
				System.out.println("서로 다른 수를 입력하세요");

			}

			System.out.println("세번째 숫자를 입력하십시오");
			int input3 = scan.nextInt();
			if (input3 == input2 || input3 == input1) {
				System.out.println("서로 다른 수를 입력하세요");

			}
			// 입력한수를 input 1,2,3
			int[] user = { input1, input2, input3 };

			// user[i] == com[i] : hit

			// i!=j && user[i] == com[j] : ball

			// user[i] != user[j] : strike

			 for (int i = 0; i < user.length; i++) {
				if (user[i] == com[i]) {
					strike++; // 1. stlike = 배열과 숫자 모두 맞을때
					continue;
				} else
					for (int j = 0; j < user.length; j++) {
						if (i != j && (user[i] == com[j])) {
							ball++;
							chk = false;
							 // ball =배열은 틀린데 숫자는 맞을때 , 이중 볼 없애기
						} else if(chk) {
							out++;
							break;// strike = 같은배열에 숫자없음 (다른배열에 숫자 잇는건 볼로 채감)
						}

					}

			}
			// strike = 3- hit- ball;

			System.out.println("내숫자 : " + Arrays.toString(user));
			System.out.println("컴퓨터숫자 :" + Arrays.toString(com));

			System.out.println("결과 :" + strike + "스트라이크," + ball + "볼," + out + "아웃");
			if (strike >= 3) {
				System.out.println("승리.");
				strike = 0;
				ball = 0;

			}

			if (out >= 3) {

				System.out.println("아웃.패배");
				strike = 0;
				ball = 0;
				out = 0;
			}
			// ----------------------------------
			strike = 0; // 테스트용!!! 나주엥 없애기
			ball = 0;
			out = 0;
			// ------------

		} // 경기 끝까지 계속 while로 진행하는 가장 큰 단위

	}
}
