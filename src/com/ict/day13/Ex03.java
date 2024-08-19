package com.ict.day13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex03 {

	public static void main(String[] args) {
		//LocalDate 클래스는 날짜만 처리하는 클래스
		//LocalTime 클래스는 시간만 다룬다.
		//LocalDateTime 클래스는 날짜와 시간 모두 처리하는 클래스
		
		//날짜와 시간가져오기
		LocalDateTime now =  LocalDateTime.now();
		System.out.println("현재날짜와 시간"+now);

		//특정날짜와 시간설정
		
		LocalDateTime day2 = LocalDateTime.of(2024, 8, 10, 0, 0, 0);
		
		System.out.println("특정날짜 : "+ day2);
		
		//현재날짜에서 7일 이후 (일주일 이후)
		LocalDateTime day3 = now.plusDays(7);
		System.out.println("일주일 후 : "+ day3);

		LocalDateTime day4 = now.minusDays(7);
		System.out.println("일주일 전 : "+ day4);
		
		//현재가 지정날짜이전인지 체크
		boolean isBefore = now.isBefore(day4);
		System.out.println("날짜가 이전이냐?" + isBefore);
				
		//날짜와 시간 포맷
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String msg = now.format(formatter);
		System.out.println(msg);
			

	}
}
