package com.ict.day05;

public class Ex05 {

	public static void main(String[] args) {
		// do~ while문 " while문과 같은 반복문 (선처리 후 비교)
		//			최소 한번은 실행한다. 
		//형식)초기식;
		//   do {
		//		실행할 문장;
		//		실행할 문장;
		//		실행할 문장;
		// 		증감식;
		//		}while(조건식);
		
		//1부터 10까지 찍기 
		int i =1;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		
		
		//구구단 5단 
		i =1;
		do {
			System.out.println("5*"+i+" = "+5*i);
			i++;
		} while (i<10);
		
		//1부터 10까지 홀수의 합, 짝수의 합 ,구하기 
		i=1;
		int odd =0 ;//홀수의합
		int even =0 ;//짝수의합
		do {
			if (i%2!=0) {
				odd=odd+i;
			} else {
				even=even+i;
			}
			
			i++;
		} while (i<11);
		System.out.println(odd);
		System.out.println(even);
		
		
	//숙제 : 위 3개를 do while(ture) 코딩하기 

	}

}
