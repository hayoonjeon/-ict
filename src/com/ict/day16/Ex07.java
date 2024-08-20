package com.ict.day16;

import java.util.HashSet;

public class Ex07 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int su = (int)(Math.random()*9)+1 ;
			if(! set1.add(su)) {
				i--;
			}
		}
		System.out.println(set1);
		System.out.println();
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		while (set2.size() < 6) {
			int su = (int)(Math.random()*9)+1 ;
			set2.add(su);
		}
		System.out.println(set2);
	}
}










