package com.ict.day12;

import java.util.Scanner;

import com.ict.day11.Ex09;

public class Ex13 {
	public static void main(String[] args) {
		Ex12 coffee = new Ex12("커피", 1800);
		Ex12 ion = new Ex12("이온", 2300);
		Ex12 cola = new Ex12("콜라", 2100);
		
		Ex12[] arr = {coffee, ion, cola};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 투입 >> ");
		int input = scan.nextInt();
		
		// 가장 작은 값 찾기
	    Ex12 min = arr[0]; // 첫번째 요소를 최소값으로 가정 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getPrice()  <   min.getPrice()) {  // min 보다 작은 값을 구하면 해당 배열의 인덱스 가직 주소를 저장한다.
				min = arr[i];
			}
		}
		
		int minPrice = arr[0].getPrice();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getPrice()<minPrice) {
					minPrice = arr[i].getPrice();
				}
			}
		}
		
		System.out.println(minPrice);
		
		if (input < min.getPrice()) {
			System.out.println("금액이 부족합니다.");
		}else {
		
			System.out.println("선택 가능한 음료 : ");
			for (int i = 0; i < arr.length; i++) {
				if (input >= arr[i].getPrice()) {
					System.out.println((i+1)+"." + arr[i].getName() + "(" + arr[i].getPrice() + "원)");
				}
			}
			System.out.println();
			
			while(input > 0) {
				System.out.print("음료 선택 >> ");
				int choice = scan.nextInt();
				
				// 입력한 숫자가 0보다는 크고, 배열 갯수보다는 작아야 한다.
				// 잔돈이 음료수 값보다는 커야 한다.
				if(choice < 1 || choice > arr.length || input < arr[choice-1].getPrice()) {
					continue ;
				}
				
				Ex12 drink = arr[choice-1];
				input = input - drink.getPrice();
				
				System.out.println(drink.getName()+"을 선택하셨습니다.");
				System.out.println("남은 잔돈 : " + input +"원");
				
				// 남은 잔돈으로 더 구매할 수  있는 음료 표시
				boolean payChk = false;
				for (int i = 0; i < arr.length; i++) {
					if(input >= arr[i].getPrice()) {
						if(!payChk) {
							System.out.println("남은 금액으로 구매 가능한 음료 : ");
						}
						System.out.println((i+1) + "." + arr[i].getName() + "(" + arr[i].getPrice() + "원)");
						payChk = true;
					}
				}
				if(!payChk) {
					break;
				}
				
				// 추가 구매 여부 확인 
				System.out.print("더 구매할까요(y/n)? ");
				String str = scan.next();
				
				if(str.equalsIgnoreCase("y")) {
					continue ;
				}else {
					break;
				}
			}
		}
		System.out.println("감사합니다.");
		System.out.println("잔돈 : " + input + "원");
	}
}
