package com.ict.day04;

public class Ex99 {

	public static void main(String[] args) {
		// 다중 if문
		// 형식) if(조건식1){
		// 		조건식1일 참일때 실행;
		// 		조건식1일 참일때 실행;
		// }else if(조건식2){
		// 		조건식1에는 거짓, 조건식2에는 참일때 실행 ;
		// 		조건식1에는 거짓, 조건식2에는 참일때 실행 ;
		// }else if(조건식3){
		// 		조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
		// 		조건식1,2에는 거짓, 조건식3에는 참일때 실행 ;
		// }else{
		// 		조건식 1,2,3이 모두 거짓인 경우 실행;
		// }int k1의 점수가 90이상 A학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점
		int scr = 0;
		String hak= "";
		
		if (scr>=90) {
			hak="A";
		} else if (scr>=80) {
			hak="B";
		} else if (scr>=70) {
			hak="C";
		} else   {
			hak="D";
		} 
		
		System.out.println("학점은 :"+hak+"학점입니다.");
		
		
		
		
		}

	}

