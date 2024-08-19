package com.ict.day10;

public class Ex02 {

	public static void main(String[] args) {

		Ex01 t = new Ex01();
		// 정보가져오기 : get
		String name = t.name;
		int sum = t.sum;
		System.out.println("이름 : " + name);
		System.out.println("합계 : jj" + sum);

		// 정보변경하기 : set
		t.name = "전하윤";
		t.sum = 300;
		name = t.name;
		sum = t.sum;
		System.out.println("이름 : " + name);
		System.out.println("합계 : " + sum);

		// 메서드 이용해서 sum 내용 변경하기
		t.play01();
		// 메서드이용해서 sum 얻어내기
		int sum2 = t.play02();
		System.out.println("합 :" + sum2); 

		
	}

}
