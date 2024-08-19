package com.ict.day14;

import java.util.Scanner;

public class Ex03_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요(1.강아지, 2.고양이)");
		int su = scan.nextInt();
		if (su==1) {
			Ex03_Dog dog = new Ex03_Dog();
			dog.sound();
			dog.play();
			dog.like();
		}else if (su==2) {
			Ex03_Cat cat = new Ex03_Cat();
			cat.sound();
			cat.play();
			cat.like();
		}
		System.out.println();
		
		
		
		//부모클래스로 선언  //업캐스팅 
		Ex03_Animal animal = null;
		
		if (su==1) {
			animal = new Ex03_Animal(); //업캐스팅
			//자식클래스로 다시 형변환 : 다운캐스팅
			Ex03_Dog ani = (Ex03_Dog)(animal); 
			ani.play();
		}else if (su==2) {
			animal = new Ex03_Animal();
			Ex03_Cat ani = (Ex03_Cat)(animal);
			//다운캐스팅하면 자식클래스 매서드 사용가능 
			ani.play();
		}
		
		//오버라이드 메서드 호출  ( 은닉화 : 부모메서드 숨겨짐)
		 
		animal.sound();
		//부모클래스가 가진 메서드
		animal.like();
		//자식클래스가 가지고 있는 메서드는 호출안됨(단점)
//		animal.play();
		
		
		
	}
}
