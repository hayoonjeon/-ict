package com.ict.day14;

public class Ex02_Manager extends Ex02_Employee {

	private double bonus = 1000;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public double getSalary() {
		return super.getSalary()+bonus;
	}
	
}
