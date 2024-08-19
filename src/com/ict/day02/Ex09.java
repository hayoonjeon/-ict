package com.ict.day02;

public class Ex09 {

	public static void main(String[] args) {
		// 증감연산자 : 1씩 증가,감소시키는 연산자
		//++(--)변수 : 현재 변수가 가지고 있는 값에 1을 증가(감소)
		//변수++(--) : 현재 변수가 가지고 있는 값을 사용하고, ;를 만난 후 1증가
		
		int su1 = 4;
		int su2 = 4;
		
		int result = ++su1*4; //5(1+4)*4
		int result2 = su2++*4;//
		
		System.out.println(result);
		System.out.println(result2);
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println();
		
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);   //   11 + 20
		System.out.println(z);   //31
		
		System.out.println(x);  // 11
		System.out.println(y);  // 19
		
		

	}

}
