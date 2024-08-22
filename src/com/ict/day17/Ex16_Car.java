 package com.ict.day17;

import java.util.ArrayList;
import java.util.List;

public class Ex16_Car {
	// 판매할 차를 가지고 있는 공간 
	private List<String> carList = null;
	//객체생성하ㅕㅁㄴ서 carlist 만들어짐 
	public Ex16_Car() {
		carList = new ArrayList<String>();
		
	}
	//해당 메서드 호출하면 carName 반환
	//차 생산 
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
		case 0:
			carName = "SM5";
			break;
		case 1:
			carName = "매그너스";
			break;
		case 2:
			carName = "카렌스";
			break;

		}
		return carName;
	}
	public synchronized String pop() {
		String carName = null;
		//판매할 차가 없다면 wait
		if (carList.size()==0) {
		try {
			System.out.println("판매할 차가 없으니 기다리세요.");
			
				wait();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		carName=carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다. 구입한 차 이름 : \" "+carName+"\"");
		return carName;

	}
	
	//차 생산 
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어졌습니다. 차 이름은 :\""+car+"\"");
		//판매할 차의 개수가 5개가 되면 대기상태
		if (carList.size()==5) {
			this.notify();
		}
	}
}








