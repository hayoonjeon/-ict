package com.ict.day15;

// 일반클래스가 인터페이스를 상속받으면 무조건 오버라이드 해야 된다.
public class Ex01_Audio implements Ex01_Remote{
	
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

}
