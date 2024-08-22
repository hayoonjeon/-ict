package com.ict.day17;

public class Ex16_Customer implements Runnable {
	private Ex16_Car car;

	
	public Ex16_Customer(Ex16_Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
				for (int i = 0; i < 20; i++) {
					carName = car.pop();
					try {
						Thread.sleep((int)(Math.random()*200));
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					
				}
		
	}

}
