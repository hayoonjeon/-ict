package com.ict.day11;

public class Ex04 {

	public static void main(String[] args) {
		
		Ex03 test = new Ex03();
		int sum = test.plus(10, 20);
		System.out.println("sum : " + sum);

		int sum2 = test.plus("10", "20");
		System.out.println("sum : " + sum2);
		
		int sum3 = test.plus(10.6, 20.5);
		System.out.println("sum : " + sum3);
		
	}
	
	
}
