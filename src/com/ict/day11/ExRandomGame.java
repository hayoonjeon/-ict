package com.ict.day11;

import java.util.Random;
import java.util.Scanner;

public class ExRandomGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random random = new Random();

		esc: while (true) {
			System.out.print("컴퓨터의 숫자를 맞추시오(1~13) ");
			int num = random.nextInt(13) + 1;

			int input = scan.nextInt();
			if (input >= 1 && input <= 13) {

			} else {
				System.out.println("다시 입력하세요");
				continue;
			}

			System.out.println("컴퓨터의 숫자 : " + num);
			if (input < num) {
				System.out.println("결과 : 낮음");
			} else if (input == num) {
				System.out.println("결과 : 비김");
			} else {
				System.out.println("결과1 : 높음");
			}

			while (true) {
				System.out.println("계속 하시겠습니까? 1)yes, 2)no ");
				int answer = scan.nextInt();

				if (answer == 1) {
					break;
				} else if (answer == 2) {
					System.out.println("수고하셨습니다.");
					break esc;
				} else
					System.out.println("잘못입력하셨습니다.");
				continue;

			}

		}

	}

}
