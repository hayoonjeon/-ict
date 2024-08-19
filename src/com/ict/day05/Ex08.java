package com.ict.day05;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// break lable : 레이블이 지정된 반복문 탈출
		// continue lable : 레이블이 지정된 반복문의 증감식(for문), 조건식(while문)으로 이동
		// 레이블 지정 : 특정 반복문 앞에 "이름"붙이면 된다
		// 주의사항 : 레이블 다음에는 무조건 반복문만 올 수 있다.

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i=" + i + ", j=" + j);

			}
		}
		System.out.println();

		exit: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 1) {
					break;
				}
				System.out.println("i=" + i + ", j=" + j);

			}
		}
		System.out.println();

		exit: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 1) {
					break exit;
				}
				System.out.println("i=" + i + ", j=" + j);

			}
		}
		System.out.println();

		Scanner scan = new Scanner(System.in);

		// 무한루프 입력받아서 홀수인지 짝수인지 판별하기(계속할까요? 1) yes 2)no )

		esc: while (true) {
			System.out.println("숫자입력 : ");
			int su = scan.nextInt();
			String str = "";
			if (su % 2 == 0) {
				str = "짝수";

			} else {
				str = "홀수";
			}
			System.out.println(su + "는" + str + "입니다.");
			while (true) {

				System.out.println("계속할까요? (1.yes, 2.no)>>");
				int num = scan.nextInt();

				if (num == 1) {
					break;
				} else if (num == 2) {
					break esc ;

				} else {
					System.out.println("숫자는 1과 2만 선택하세요.");
					continue  ;
				}
			} // 안쪽 while 끝

		} // 바깥 while 끝

	}
}
