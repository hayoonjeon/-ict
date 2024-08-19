package com.ict.day12;

public class Ex18 {
	private String cardName;
	private int money;
	
	public Ex18() {
		this("국민카드", 3000000);
	}
	
	public Ex18(String cardName) {
		this.cardName = cardName;
		this.money = 2000000;
		getCard();
	}
	
	public Ex18(String cardName, int money) {
		this.cardName = cardName;
		this.money = money;
		getCard();
	}
	public void getCard() {
		System.out.println("카드사는 " + cardName + " 입니다.");
		System.out.println("한도는 " + money + " 입니다.");
	}
	
}
