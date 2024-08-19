package com.ict.day15;

// 예외처리 : Exception (try ~ catch )
//    목적 : 비정상적인 종료를 정상적인 종료로 유도하고, 예외 발생 시 예외에 대한 처리를 해준다.
//    형식 : try{
//             예외 발생 가능한 문장들;
//             예외 발생 가능한 문장들;
//             만약 예외가 발생하면 아래문장 무시, catch 문으로 이동한다.    
//             예외 발생 가능한 문장들;
//           } catch(예외객체 e){
//              예외 발생 시 처리하는 문장들;
//              예외 발생 시 처리하는 문장들;
//           }
public class Ex11 {
	public static void main(String[] args) {
		try {
			int[] su = {10,20,30};
			for (int i = 0; i <= su.length; i++) {
				System.out.println("1");
				System.out.println("2");
				System.out.println("su[" + i + "] = " + su[i]);
				System.out.println("4");
				System.out.println("5");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("여기는 catch문");
			System.out.println(e);
		}
		System.out.println("수고하셨습니다.");
	}
}


















