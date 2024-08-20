package com.ict.day16;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public static void main(String[] args) {
		Set<Integer> lottoNum = new HashSet<Integer>();
		while (lottoNum.size() < 6) {
			int number = (int)(Math.random()*45)+1 ; // 1-45까지
			lottoNum.add(number);
		}
		System.out.println(lottoNum);
	}
}
