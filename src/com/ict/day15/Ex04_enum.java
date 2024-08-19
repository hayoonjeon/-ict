package com.ict.day15;

enum Type{
	WARKING, RUNNING, TRACKING, HIKING
}

public class Ex04_enum {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		// main() 도 static 이므로 static 변수, 상수만 사용가능
		// System.out.println(name);
		
		// main() 에서 인스턴스 변수를 사용하기 위해서는 무조건 객체 생성해야 된다. 
		Ex04_enum shose = new Ex04_enum();
		System.out.println(shose.name);
		System.out.println(shose.size);
		System.out.println();
		
		shose.name = "나이키";
		shose.size = 275;
		shose.type = Type.RUNNING;
		
		System.out.println("이름 : " + shose.name);
		System.out.println("사이즈 : " + shose.size);
		System.out.println("타입 : " + shose.type);
		
	}
}
