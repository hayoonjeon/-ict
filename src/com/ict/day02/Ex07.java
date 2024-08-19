package com.ict.day02;

public class Ex07 {
	public static void main(String[] arg) {
		//9630초는 몇시간 몇분 몇초일까요? 
		
		
		
		//int total = 9630 ;
		
		
		//int h = 0;
		//int m = 0;
		//int s = 0;
		
		//int result = 0; //나머지 구하는변수  - 질문필요..!!!  
		
		// 정수 = 정수/정수 
		//h = total/3600; //60*60 
		
	//	result = total%3600;
	
		//m= result / 60;
		
	//	s= result%60;
		
	//	System.out.println(h +""+  m +""+  s );
		
		
		
		
		
		
		
		
		
		
	 //정보입력 
		
		int total = 9630;
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		int result = 0;
		
		
		
		//값 넣어보기 시작  

		hour = total /(60*60); // 2시간 ( 몫)
		
		result= total%(60*60); // 2시간 빼고 남은 시간(초단위) 
		
		min = result/60; // 2시간 빼고 남은 시간(초단위)를 분으로 바꿀때 몫= 분 ( 초는 나머지로 버려짐)  
		
		
		sec = result%min;  // 2시간 빼고 남은 시간을 분으로 바꿨을때 나머지 = 초 
		
	   
	
	    
		
		
		
	System.out.println("9630초는 "+hour+"시간 "+min+"분 "+sec+"초입니다.");
		
		
		
		
	}

}
