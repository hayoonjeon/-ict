package com.ict.day15;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 무조건 실행해야 되는 문장을 처리할 때 사용
//           주로 데이터베이스, 입/출력, 네트워크에서 사용 됩니다.(XXXX.close())

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
//		}finally{
//          예외 처리와 상관없이 무조건 실행해야 하는 문장;
//          예외 처리와 상관없이 무조건 실행해야 하는 문장;
//      }

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int su1 = 25;
			System.out.print("정수입력 : ");
			int su2 = scan.nextInt();
			System.out.println("정답 : " + (su1 / su2));
			// scan.close();
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수 없습니다.");
			// return;
		} catch (InputMismatchException e) {
			System.out.println("문자을 입력하지 마세요");
			scan.nextLine();
		} finally {
			scan.close();
			System.out.println("무조건 실행되는 공간");
		}
		
		System.out.println("수고하셨습니다.");
	}
}




