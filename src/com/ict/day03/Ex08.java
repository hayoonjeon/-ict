package com.ict.day03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1. 숫자를받아서 해당 숫자가 홀수인지 짝수인지 판별하자
		System.out.print("숫자 입력 : ");
		int number1 = scan.nextInt();
		
		 String str =  (number1%2==0)? "짝수" : "홀수";
		System.out.println("결과 : "+str);
		
		//2. 점수를 받아서 해당점수가 80이상이면 합격, 아니면 불합격
		System.out.println("점수 입력 : ");
		int number2 = scan.nextInt();
		
		str = (number2>=80)? "합격" : "불합격";
		System.out.println("결과 : "+str);
		
		//3. 근무시간 받아서 8시간 이상이면  8시간까지는 9860이고 
		//8시간 초과한 시간은 1.5배 를 한다. 
		System.out.println("근무시간 : ");
		int time = scan.nextInt();
		int dan = 9860;
		int money = (time<=8)? (dan*time) :
			(dan*8)+(int)(1.5*(dan)*(time-8));
		
		System.out.println(money+"원입니다.");
		
		
		
		//4. 두 수를 입력받아서 큰 수를 출력하자.
		System.out.println("첫번째 수 : ");
		int number3 = scan.nextInt();
		System.out.println("두번째 수 : ");
		int number4 = scan.nextInt();
		
		int big = (number3>number4)? number3 : number4;
		
		System.out.println(big);
		
		
		
		
		
		
	}

}
