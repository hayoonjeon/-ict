package com.ict.day09;

public class Ex05 {
	// 배열과 다르게 다양한 자료형들을 한번에 저장할 수 있다.
	String name = "홍길동";
	int kor = 80 ;
	int eng = 90 ;
	int math = 100 ;
	int sum = 0 ;
	double avg = 0.0;
	char hak = 0 ;
	int rank = 1 ;
	
	// 멤버메서드 : 동작, 기능, 하는 것
	//           해당 메서드를 호출하면 실행 후 호출간 곳으로 되돌아 간다. (return)
	//           되돌아 갈때  ---> 데이터를 가지고 하는 메서드 ( 가지고 가는 데이터의 자료형을 반환형)
	//                     ---> 그냥 가는 메서드 (가지고 가는 데이터가 없으면 void 예약어 사용)
	
	// 메서드형식 : [접근제한자][메서드종류] 반환형 메서드이름([매개변수=인자]){ 실행 내용 }
	//           - 접근제한자  : public (누구나 접근), private(외부에서는 접근불가), 생략(default), protected
	//           - 메서드종류 : 특정한 메서드일때만 예약어를 사용해서 표시 , 일반적인 메서드 메서드종류가 생략되어 있다.
	//                       static, final 등 사용가능
	//           - 반환형 : 되돌아 갈때  ---> 데이터를 가지고 하는 메서드 (가지고 가는 데이터의 자료형을 반환형)
	//                               ---> 그냥 가는 메서드 (가지고 가는 데이터가 없으면 void 예약어 사용)
	//                     ** 되돌아 갈때 반환형이 있는 메서드는 반드시  마지막 줄에 return 데이터 or 데이터를 가진변수 ;
	//           - 메서드이름 : 소문자로 시작한다. 두 단어 이상이면 단어의 첫글자는 대문자로 하자 
	
	// 아래 메서드들은 모두 Instance 메서드 이다.
	
	public void play01() {
		System.out.println("메서드안 처리 전");
		sum = kor + eng + math ;
		System.out.println("메서드안 처리 후");
	}
	
	public int play02() {
		int k = kor + eng + math;
		return k ;
	}
	public String play03() {
		return String.valueOf(kor + eng + math);
	}
	// 반환형이 실제 데이터보다 자료형이 크다  
	public double play04() {
		return kor + eng + math;
	}
	
	/* 오류 발생  : 반환형이 실제 데이터의 자료형보다 작다
	public int play05() {
		return 15.124 ;
	}
	*/
}










