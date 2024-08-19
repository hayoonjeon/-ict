package com.ict.day15;

public class Ex01_Main {
	public static void main(String[] args) {
		Ex01_MyClass myClass1 = new Ex01_MyClass();
		System.out.println();
		
		Ex01_Audio audio = new Ex01_Audio();
		Ex01_MyClass myClass2 = new Ex01_MyClass(audio);
		System.out.println();
		
		Ex01_MyClass myClass3 = new Ex01_MyClass(new Ex01_Audio());
		System.out.println();
		
		Ex01_MyClass myClass4 = new Ex01_MyClass(new Ex01_TV());
		System.out.println();
		System.out.println("====================");
		
		audio.setVolume(5);
		audio.setVolume(10);
		audio.setVolume(11);
		audio.setVolume(0);
		audio.setVolume(-1);
		
		// 오류
		// myClass3.setVolume(8);
		// myClass4.setVolume(2);
		
	}
}
