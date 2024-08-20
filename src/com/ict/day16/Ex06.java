package com.ict.day16;

public class Ex06 {
	public static void main(String[] args) {
		// 배열 6 자리 채우기 (중복안됨)
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			int su = (int)(Math.random()*9)+1 ; // 1-9
			arr[i] = su ;
			for (int j = 0; j < i; j++) {
				if(arr[j]  == arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}
}
