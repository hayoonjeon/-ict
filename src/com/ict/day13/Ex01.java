package com.ict.day13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
	
		//날짜클래스
		//Date 클래스	(1.0)
		//Calendar 클래스 (2.0)
		//LocalDate 클래스 (3.0)
		
		//1. date 클래스 
		Date date = new Date();
		System.out.println(date);
		
		//기본현태변환
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-M-d H : m : s");
		System.out.println(sdf.format(date));
		
		//년월일 시 분 초 요일  ㅡㅡ 시스템사으이 년 월 일 시 분 초 
		
		System.out.println(date.getYear()+1900+"년");
		System.out.println(date.getMonth()+1+"월");
		System.out.println(date.getDate()+"일");
		System.out.println(date.getHours()+"시");
		System.out.println(date.getMinutes()+"분");
		System.out.println(date.getSeconds()+"초");
		
		int k = date.getDay();
		switch (k) {
		case 0 : System.out.println("일요일");break;
		case 1 : System.out.println("월요일");break;
		case 2 : System.out.println("화요일");break;
		case 3 : System.out.println("수요일");break;
		case 4 : System.out.println("목요일");break;
		case 5 : System.out.println("금요일");break;
		case 6 : System.out.println("토요일");break;
	
		}
		
		System.out.println(k);
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	
	}
	

}
