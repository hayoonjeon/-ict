package com.ict.day03;

public class Ex02 {

	public static void main(String[] args) {
		// 논리 연산자 : || (AND,논리곱, 교집합)
		//			|| (OR, 논리합, 합집합)
		//			! (NOT, 논리부정)

		// || (OR, 논리합, 합집합)
		// 주어진 조건들 중에 하나라도 true가 있으면 결과는 true
		//true를 만나면 이후 연산하지 않는다.
		
		int su1 = 10;
		int su2 = 7;
		boolean res = false;
//		ture = ture || true
		res = (su1 >= 7) || (su2 >= 5);
		System.out.println(res);
		
//		true = false || true
		res = (su1 <= 7) || (su2 >= 5);
		System.out.println(res);
		
//		true = ture || false
		res = (su1 >= 7) || (su2 <= 5);
		System.out.println(res);
		
//		false = false || false
		res = (su1 <= 7) || (su2 <= 5);
		System.out.println(res);
		System.out.println();
		
		// OR은 true를 만나면 결과가 true이므로 이후 연산을 하지 않음
		
		su1 =10;
		su2 = 7;
		
				//true 
		res = ((su1 = su1+2) > su2)||(su1 == (su2 = su2+5));
		System.out.println("결과 : " + res); //true
		System.out.println("su1 : " + su1); // 12
		System.out.println("su2 : " + su2); //7
		System.out.println();
		
		//  NOT ( ! , 논리부정)
		// 주어진 논리값을 반대로 출력;
		//true -> false , false -> true 
		
		res = true;
		
		System.out.println(res);
		System.out.println(!res);
		System.out.println(!!res);
		System.out.println(!!!res);
		
		
		
		
		
		
	}

}
