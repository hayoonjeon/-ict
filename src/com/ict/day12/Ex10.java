package com.ict.day12;

public class Ex10 {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private String hak;
	private int rank ;
	
	public Ex10(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		rank = 1 ;
		
		// 총점 구하는 메서드 호출한다.
		play01(); 
		// 평균 구하는 메서드 호출한다.
		play02();
		// 학점 구하는 메서드 호출한다.
		play03();
	}
	
	public void play01() {
		sum = kor + eng + math;
	}
	
	public void play02() {
		avg = (int)(sum/3.0 * 10) /10.0 ;
	}
	
	public void play03() {
		if(avg>=90) {
			hak = "A학점";
		}else if(avg>=80) {
			hak = "B학점";
		}else if(avg>=70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
