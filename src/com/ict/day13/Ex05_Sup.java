package com.ict.day13;

import java.util.Random;

public class Ex05_Sup extends Random {

	int su = 0;
	public void play() {
		//nextInt는 Random의 메서드
		su = nextInt(10);
		System.out.println(su);
		
	}

}
