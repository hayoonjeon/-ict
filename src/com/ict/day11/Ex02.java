package com.ict.day11;

public class Ex02 {
	public static void main(String[] args) {
		
		Ex01 test = new Ex01();
		int s1 = 100;
		int s2 = test.play01(s1);
		
		System.out.println("s1 :" + s1);
		System.out.println("s2 :" + s2);
		System.out.println();
		
		int[] s3 = {10,20,30};
		System.out.println("s3 : " + s3);
		test.play02(s3);
		for (int i = 0; i < s3.length; i++) {
			System.out.println(s3[i]);
		}
		
		
		
		
		
		
	}
	
}
