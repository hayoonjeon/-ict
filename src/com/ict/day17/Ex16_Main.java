package com.ict.day17;

public class Ex16_Main {
	public static void main(String[] args) {
		Ex16_Car car = new Ex16_Car();
		
		Ex16_Producer producer = new Ex16_Producer(car);
		Ex16_Customer customer = new Ex16_Customer(car);
		
		new  Thread(producer).start();
		new Thread(customer).start();
		
		
		
		
		
	}

}
