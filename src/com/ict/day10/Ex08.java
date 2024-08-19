package com.ict.day10;

public class Ex08 {

	public static void main(String[] args) {
		
		Ex07 minsu = new Ex07();
		Ex07 heejin = new Ex07();
		Ex07 sumi = new Ex07();
		Ex07 yoon = new Ex07();
		
		System.out.println(minsu.id);//0
		System.out.println(heejin.id);//0
		System.out.println(sumi.id);//0
		System.out.println(yoon.id);//0
		
		System.out.println(minsu.nextId);//1
		System.out.println(heejin.nextId);//1
		System.out.println(sumi.nextId);//1
		System.out.println(yoon.nextId);//1
		
		
		minsu.setId(); //1+1 = 2 (스태틱)
		System.out.println(minsu.getNextId());//nextId(스태틱 2)
		
		heejin.setId(); //스태틱2+1 = 3
		System.out.println(heejin.getNextId());//next스태틱3
		
		sumi.setId(); //스태틱3+1 =스태틱4
		System.out.println(sumi.getNextId());//스태틱4
		
		yoon.setId();//스태틱4+1 =스태틱5
		System.out.println(yoon.getNextId());//스태틱5 가져오기
		
		
		
		
		
		
		
		
	}
}
