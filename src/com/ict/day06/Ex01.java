package com.ict.day06;

import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		// 선택 배열 정렬하기 
		int[] su = {4,3,9};
		
		
//		su i { 4 3 9
		
//		su j  {4 3 9 
		
		
//		su i    >>439 
//		su j	>>439
		//임시저장
		int tmp = 0;
		
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				if (su[i]>= su[j]) { //오름(>) 내림(<)
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}

	}

}
