package com.ict.day10;

public class Ex16 {

	public static void main(String[] args) {
		
		//static으로 접근하기
		int s1 = Ex15.total;
		//static이라도 private이면 접근불가 
		//String s2 = Ex15.sum;
		
		Ex15 test = new Ex15();
		
		String str1 = test.addr;
		//String str2 = test.name;
		int str3 = test.total;
		//int str4 = test.sum;
		
		//private이면 직접 데이터를 가져오거나 변형하지못함
		
		//메서드 접근해서 데이터 얻기
		 String name = test.haYoon();
		 System.out.println("이름 : " + name);
		 
		 int sum = test.haYoon2();
		 System.out.println("합계 : " + sum);
		
		
		 
		//메서드 접근해서 데이터 변경하기
		 //이름을 마이콜, sum을 975로 변경하고 확인하자ㅏ 
		test.haYoon3("마이콜");
		test.haYoon4(975);
	   name = test.haYoon3("마이콜");
		sum = test.haYoon4(975);
		System.out.println("이름 : " + name);
		System.out.println("수자 : " + sum);
		
		
	}
		
	
}
