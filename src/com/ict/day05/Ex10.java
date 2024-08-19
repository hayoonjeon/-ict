package com.ict.day05;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 나누기해서 짝수 나오는 ...?
		// 전체횟수와 짞수 해서 확률 구해보기
		// 무한루프 돌리고 전체 횟수와 짞수인 ㅚㅅ수 구해서 확률을 구하자
		Scanner scan = new Scanner(System.in);

		String str = "";
		int count =0;
		int odd =0;
		int even=0;
		double per =0.0;
		esc:while (true) {
			System.out.println("숫자입력>>");
			int num = scan.nextInt();
			count+=1;
		
			if (num % 2 != 0) {
				str = "홀수";
				odd+=1;
			} else {
				str = "짝수";
				even+=1;
			}
			System.out.println(num + "은 " + str + "입니다");
	
		
		while(true) {
		System.out.print("계속할까요?>>1)yes  2)NO");
		int input = scan.nextInt();
			if (input==1) {
				continue esc;
			} else {
				System.out.println("횟수="+count);
				System.out.println("홀수="+odd);
				System.out.println("짝수="+even);
				System.out.println("홀수나온확률 :"+((int)(100000.000*odd/count))/1000.000+"%");
				System.out.println("짝수나온확률 :"+((int)100000.000*even/count)/1000.000+"%");
				System.out.println("수고하셧습니다.");
				break esc; //per 넣어서 깔끔하게 해보자 

			}
		
		
		}
	}

}
}
