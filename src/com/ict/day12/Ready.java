package com.ict.day12;

import java.util.Random;

public class Ready {

	private int[] computer;
//무작위수 int[] computer에 저장.
public Ready() {
	while (true) {
	computer = new int[3];
	computer[0] = (int)(Math.random()*10);
	computer[1] = (int)(Math.random()*10);
	computer[2] = (int)(Math.random()*10);
	if (computer[0]!=computer[1]&&
			computer[1]!=computer[2]&&
			computer[0]!=computer[2]) {
		break;
	}
			
	}
			
}

public int[] getComputer() {
	return computer;
}

public void setComputer(int[] computer) {
	this.computer = computer;
}

}
