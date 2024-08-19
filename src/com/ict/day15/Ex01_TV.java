package com.ict.day15;

public class Ex01_TV implements Ex01_Remote{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Ex01_Remote.MAX_VOLUME) {
			this.volume = Ex01_Remote.MAX_VOLUME;
		}else if(volume < Ex01_Remote.MIN_VOLUME) {
			this.volume = Ex01_Remote.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);// TODO Auto-generated method stub
		
	}

}
