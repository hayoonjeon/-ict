package com.ict.day13;

import java.util.Random;

public class Ex05_Main {

	public static void main(String[] args) {

		Random ran = new Random();
		int su = ran.nextInt(); //0~9
		System.out.println(su);
		
		Ex05_Sub test = new Ex05_Sub();
		test.play();
		
		
		
		
		
		
		
	}

}
