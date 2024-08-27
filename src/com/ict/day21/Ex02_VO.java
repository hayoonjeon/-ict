package com.ict.day21;

// VO : ValueObject : 데이터를 저장하는 클래스

public class Ex02_VO {
	private int id;
	private String brand;
	private String name;
	private String price;
	
	public Ex02_VO() {}
	public Ex02_VO(int id, String brand, String name, String price) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
