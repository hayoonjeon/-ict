package com.ict.day11;

public class Ex05 {

	private String name;
	private int price;
	
	//getter : private 데이터를 메소드르 통해 전달
	//setter : private 데이터를 메소드를 통해 변경
	
	//name 전달
	public String getName() {
		return name;
	}
	
	//price 전달
	public int getPrice() {
		return price;
	}
	
	//name 변경
	public void setName(String name) {
		//지역변수와 전역변수의 이름이 같으면 지역변수가 우선. 
		//전역변수를 사용하려면 전역변수앞에 this.을 붙인다. (this.변수이름)
		this.name = name;
	}
	
	//price 변경 
	public void setPrice(int k1) {
		price = k1;
	}
}


//높음 낮음 맞추기 ? 