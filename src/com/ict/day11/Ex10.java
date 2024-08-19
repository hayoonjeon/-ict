package com.ict.day11;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// Ex10을 객체로 만들어서 배열에 넣자

		Ex09 coffe = new Ex09();
		coffe.setName("커피");
		coffe.setPrice(1800);

		Ex09 ion = new Ex09();
		ion.setName("이온");
		ion.setPrice(2300);

		Ex09 cola = new Ex09();
		cola.setName("콜라");
		cola.setPrice(2100);

		Ex09[] arr = { coffe, ion, cola }; // 클래스형 배열..?

		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("금액 투입>> ");
			int input = scan.nextInt();

			// 금액으로 오른차순 정렬해서 맨 앞에 있는 가격이 가장 작은 가격
			Ex09 tmp = new Ex09();
			for (int i = 0; i < arr.length - 1; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i].getPrice() > arr[j].getPrice()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}

			if (input < arr[0].getPrice()) {
				System.out.println("잔액이 부족합니다.");
				continue;
			} else {

				System.out.println("선택 가능한 음료 :");
				for (int i = 0; i < arr.length; i++) {
					if (input >= arr[i].getPrice()) {
						System.out.println((i + 1) + "." + arr[i].getName() + "(" + arr[i].getPrice() + ")" + "원");
					}
				}
				System.out.println();

				while (input > 0) {
					System.out.println("음료선택>>");
					int choice = scan.nextInt();

					// 입력숫자가 0보다 크고 배열갯수보단 작아야함
					// 잔돈이 음료수값보다는 커야한다 .

					if (choice < 1 || choice > arr.length || input < arr[choice - 1].getPrice()) {
						continue;
					}

					Ex09 drink = arr[choice - 1];
					input = input - drink.getPrice();

					System.out.println(drink.getName() + "을 선택하셨습니다.");
					System.out.println("남은 잔돈은" + input + "원");

					// 남은 잔돈으로 더 구매할 수 있느 음료 표시

					boolean payChk = false;
					for (int i = 0; i < arr.length; i++) {
						if (input >= arr[i].getPrice()) {
							if (!payChk) {
								System.out.println("남은 금액으로 구매 가능한 음료 : ");
							}
							System.out.println((i + 1) + "." + arr[i].getName() + arr[i].getPrice() + "원");
							payChk = true;
						}

					}
					if (!payChk) {
						break;
					}
					System.out.println("더 구매할까요? y/n");
					String str = scan.next();
					if (str.equalsIgnoreCase("y")) {
						continue;
					}
				}
			}
			System.out.println("감사합니다.");
			System.out.println("잔돈 :" + input + "원");
			break;
		}
	}
}
