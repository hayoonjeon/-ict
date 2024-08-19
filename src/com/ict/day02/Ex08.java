package com.ict.day02;

public class Ex08 {

	public static void main(String[] args) {
		// 카페모카가 3500원이다
		//친구와 둘이서 10000원 내고 주문함
		//잔돈은 얼마인가? (부가세는 전체금액 10%포함)
		
		//String menu ="카페모카";
		//int dan = 3500;
		//int su = 2;
		//int input = 10000;
		//int total =dan*su;
		//int vat1 = total/10;
		//int sum1 = total + vat1;
		
		//int vat2 = (int)(total*1.1);
		//int sum2 = total + vat2 ;
		
		//int sum3 = (int)(total*1.1);
		
		//int charge = input-sum1;
		//System.out.println("잔돈 : " + charge+"원");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int coffe = 3500;
		int su = 2;
		int nonTaxTotal = coffe*su ;
		int tax = nonTaxTotal/10;  // 걍 세금 따로 치지말고  1.1배하면 편하지만 최대한 돌아돌아가서 작성해봄 
		int total = nonTaxTotal+tax;
		int myMoney = 10000;
		int change = myMoney-total;
		
		
		
		System.out.println(change+"원입니다.");
				

	}

}
