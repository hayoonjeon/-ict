package com.ict.day17;

public class Ex16_Producer implements Runnable {

	private Ex16_Car car;

	public Ex16_Producer(Ex16_Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
