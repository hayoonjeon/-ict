package com.ict.day10;

public class Ex06 {

	public static void main(String[] args) {
		Ex05 t = new Ex05();
		int res1 = t.cnt1;
		int res2 = Ex05.cnt2;
		int res3 = t.cnt2;
		System.out.println(res1);//0
		System.out.println(res2);//0
		System.out.println(res3);//0
		
		t.countUp1();// cnt 1   cnt 1
		Ex05.countUp2();// cnt1 cnt 2
		t.countUp2(); // cnt1 cnt3
		
		res1= t.cnt1; //1 인 1
		res2 = Ex05.cnt2; //2 스3
		
		
		System.out.println("res1 = "+ res1);//1
		System.out.println("res2 = "+ res2);//3
		
	//-------------------------------------------------------------	
		Ex05 t2 = new Ex05(); // 
		
		int result1 = t2.cnt1; //0
		int result2 = t2.cnt2;//3
		
		System.out.println(result1);//0
		System.out.println(result2);// 3
		
		
		
		t2.countUp1();//1 4
		t2.countUp2();//1 5
		
		result1 = t2.cnt1; // 1
		result2 = t2.cnt2; //5
		
		System.out.println(result1); //1
		System.out.println(result2);//5
		
		
		
		
	}

		
}
