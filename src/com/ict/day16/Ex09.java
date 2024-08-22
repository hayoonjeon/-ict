package com.ict.day16;

import java.util.HashSet;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Set<Integer> lottoNumbers = new HashSet<Integer>();
			while (lottoNumbers.size()<6) {
				int number = (int)(Math.random()*45)+1;
				lottoNumbers.add(number);
			}
				
				int bonusNumbers;
				do {
					bonusNumbers = (int)(Math.random()*45)+1;
				} while (lottoNumbers.contains(bonusNumbers));
				System.out.println(lottoNumbers+","+bonusNumbers);
				
			}
		}
	}

