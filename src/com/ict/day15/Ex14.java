package com.ict.day15;

import java.util.Scanner;

// throws : 예외전가, 예외양도
//          예외가 발생하면 예외처리를 하지 않고 자신을 호출한 곳으로 예외객체를 전달.
//          나중에라도 예외처리(try~catch)를 하는 것이 좋다. 

public class Ex14 {
	
	public void setData(String str) throws NumberFormatException {
		// try {
			if(str.length() >= 1) {
				String res = str.substring(0, 1);
				prnData(res);
			}
		//  } catch (NumberFormatException e) {
		//		System.out.println("첫글자는 숫자로  ~~~~");
		// }
	}
	
	// throws : 해당 메서드를 호출한 곳으로 예외객체를 양도 한다.
	public void prnData(String res) throws NumberFormatException{
		// try {
			int dan = Integer.parseInt(res);
			System.out.println(dan + "단");
			for (int i = 0; i < 10; i++) {
				System.out.println(dan + "*" + i + " = " + (dan*i));
			}
		// }catch (NumberFormatException e) {
		//	System.out.println("첫글자는 숫자로 입력하세요");
		// }
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		
		String msg = scan.next();
		Ex14 t = new Ex14();
		try {
			t.setData(msg);
		} catch (Exception e) {
			System.out.println("문자 입력하지마");
		}
		
		System.out.println("수고하셨습니다.");
	}
}
