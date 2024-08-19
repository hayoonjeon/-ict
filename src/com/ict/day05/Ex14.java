package com.ict.day05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Ex14 {

	public static void main(String[] args) {
		// Arrays 클래스 : 배열을 다루기 위한 다양한 메서드(기능)가 포함되어 있는 클래스
		// 클래스가 가질 수 있는 요소는 : 필드, 메서드, 생성자
		// 필드 - 데이터 - 변수, 상수
		// 메서드() - 기능, 동작
		// 생성자 - 나중에

		int[] arr = new int[100];

		// for문 이용해서 데이터 저장하자

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}
		// Arrays.binarySearch(배열, 찾는값) : 해당 배열에서 값을 검색 한 후 있는 위치값(index)을 반환
		// 만약 없는 값을 찾으면 음수
		int su = Arrays.binarySearch(arr, 45);

		System.out.println(su);
		
		//정렬: Arrays.sort(배열) :오름차순 정렬된다.

		String[] str = { "둘리",  "희동이", "마이콜","고길동" };
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		//str 배열이 오름차순 정렬됨 
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		int su2 = Arrays.binarySearch(str, "희동이");

		System.out.println(su2);
		System.out.println();
		
		
		
	// 3. COPYoF : 배열을 동일한 길이 또는 지정한 길이로 복사
		
		
		
		Arrays.copyOf(str, 2);
		String[] co = Arrays.copyOf(str, 2);
		
		for (int i = 0; i < co.length; i++) {
			System.out.println(co[i]);
			
		}
		System.out.println();

		//배열의 객체 취급한다 >> heap 메모리에서 만들어진다 (초기화를 해줌)
		//지역변수들은 stack 메모리에서 만들어진다 (초기화없음)
		String[] co2 = Arrays.copyOf(str, 6);
		for (int i = 0; i < co2.length; i++) {
			System.out.println(co2[i]);
			
		}
		System.out.println();
		System.out.println("copyOfRange");
		
		
		
		//4. Arrays. copyOfRange(배열, 시작위치, 끝위치(포함안됨))
		//끝 위치를 현재 배열보다 크면 알아서 늘려준다.
		String[] co3 = Arrays.copyOfRange(str, 2,7);
		for (int i = 0; i < co3.length; i++) {
			System.out.println(co3[i]);
			
		}
		System.out.println();
		
		
		//5. fill (배열,초기값) : 해당 배열의 모든 요소에 특정값을 채울때 사용
		System.out.println("fill() 예제");
		int[] arr2 = new int[20];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		Arrays.fill(arr2, 15);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//6.Arrays.equals(배열1,배열2) : 두 배열의 내용이 같은지 비교
		//주의) 객체 :  ==는 주소가 같으면 true, 다르면 false
		//	기본자료형 ==는 내용이 같으면 true, 다르면 false
		
		//String[] str = { "고길동",  "둘리", "마이콜","희동이" };
		
		
		String[] str2 = { "둘리",  "희동이", "마이콜","고길동" };
		
		boolean res = Arrays.equals(str, str2);
		System.out.println("결과 : "+res);
		
		// str2를 오름차순정렬해서  str과 같게 만들자 
		
		Arrays.sort(str2);
		
		 res = Arrays.equals(str, str2);
		System.out.println("결과 : "+res);
		
		//7.toString(배열) 배열을 문자열로 변환하여 출력
			String str3 = Arrays.toString(str2); 
			System.out.println(str3);//배열 String으로 변환해서 출력
			System.out.println(str2);//배열이므로 주소가 나옴 
		
		//8. asList (배열) : 배열을 리스트(컬렉션=객체들을 모아놓은것)로 변환시킨다. 
		//나중에 컬렉션할때배운다. List.toArray는 리스트를 배열로 변환시킨다.
		
		//9.내림차순 : Arrays클래스에선 내림차순 안됨 
		
		// 방법1 :  배열을 복사 후 오름차순 정렬하고, 역순으로 호출해서 저장함
		//	방법2 : 컬렉션을 이용 하는 방법
		
		//9-1 배열 복사 
		int[] arr3 = {8,1,7,3,9,5};
		int[] arr4 = Arrays.copyOf(arr3, arr3.length);
		
		if (arr3 == arr4) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");

		}
		
		
		if (Arrays.equals(arr3,  arr4)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//9-2 배열 오름차순
		Arrays.sort(arr3); // ar3 = {1,3,5,7,8,9}
		int k =0;
		
		for (int i = arr4.length-1; i >=0 ; i--) { //for int i = (6-1); i>=0; i--) : 5,4,3,2,1,0 순서로 i는 변함 
			arr4[k++] = arr3[i];					//arr4[0~] = 
		}
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		//방법2)컬렉션을 이용하는 방법
		//주의 사항 : int 배열이 아님, Intgeer(배열 사용
		//Integer 클래스란 int기본자료형을 객체로 만들어주는 클래스이다. 
		Integer[] arr5= {7, 6, 4, 8, 9, 2, 3, 1};
		Arrays.sort(arr5,Collections.reverseOrder());
	
		
		System.out.println(Arrays.toString(arr5));
		
		for (int i = 0; i < arr5.length; i++) {
			System.out.println(arr5[i]);
		}
		
	}
}
