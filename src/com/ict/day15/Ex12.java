package com.ict.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

// 예외처리 : 다중 catch : 예외가 하나가 아니라 여러가지가 발생 할 경우 사용
//	형식 : try{
//			예외 발생 가능한 문장들;
//			예외 발생 가능한 문장들;
//			만약 예외가 발생하면 아래문장 무시, catch 문으로 이동한다.    
//			예외 발생 가능한 문장들;
//		} catch(예외객체 e){
//			예외 발생 시 처리하는 문장들;
//			예외 발생 시 처리하는 문장들;
//		}catch(예외객체 e){
//			예외 발생 시 처리하는 문장들;
//			예외 발생 시 처리하는 문장들;
//		}
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			try {
				int su1 = 25;
				System.out.print("정수입력 : " );
				int su2 = scan.nextInt();
				System.out.println("정답 : " + (su1 / su2));
			}catch (ArithmeticException e) {
				System.out.println("0으로는 나눌수 없습니다.");
			}catch (InputMismatchException e) {
				System.out.println("문자을 입력하지 마세요");
				scan.nextLine();
			}
		}
	}
}


















