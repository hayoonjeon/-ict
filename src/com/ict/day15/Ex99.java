package com.ict.day15;

public class Ex99 {
	public static void main(String[] args) {
		//익명 내부클래스 없이 
		Ex10_Test t1 = new Ex10_Test();
		t1.printData();
		
		Ex10_Test2 t2 = new Ex10_Test2();
		t2.play();
		
		Ex10_Test3 t3 = new Ex10_Test3();
		t3.prn(new Ex10() {
			
			@Override
			public void printData() {
			 int data3 = DATA+100;
			 System.out.println("data3 : " + data3);
			}
		});//익명클래스 선언됨.. 익명클래스의 printdata 
	//이므로 값도 써줘야함 ... test2랑 ㅏㄷ름 
		
		Ex10 t4 = new Ex10() {
			
			@Override
			public void printData() {
				int data4 = DATA + 100;
				System.out.println("data4 : " + data4);
				
			}
		};
		
		t4.printData();
		
		
		
		
		
	}
	
	
	
	
}
	
	

