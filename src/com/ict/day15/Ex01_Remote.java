package com.ict.day15;

// 인터페이스 : 상수와 추상메서드로 구성
public interface Ex01_Remote {
	// 상수 : static final
	int MAX_VOLUME = 10 ;
	int MIN_VOLUME = 0 ;
	
	// 추상메서드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
