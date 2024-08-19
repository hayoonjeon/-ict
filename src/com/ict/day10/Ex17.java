package com.ict.day10;

public class Ex17 {
   
    private String name;
    private int kor;
    private int eng; 
    private int math; 
    private int sum;
    private double avg; 
    private String hak;
    private int rank; // 기본 순위
 

public void play01(String k1, int k2, int k3, int k4) {
	name = k1; 
	kor = k2;
	eng = k3;
	math = k4;
	//1.총점, 평균, 학점 한번에 구할 수 있다.(자기마음)
	//2. 메서드가 메서드를 호출할 수 있다.(main()에서 
	//play01(),play02(),play03() 호출해도 된다
	play02();
	play03();
	play04();
	play05();
}

//총점
public void play02() {
	sum = kor + eng + math;
	
}
//평균
public void play03() {
	avg = (int)(sum/3.0*10)/10.0;
	
}
//학점
public void play04() {
	if (avg>=90) {
		hak = "A학점";
	} else if (avg>=80) {
		hak = "B학점";
	} else if (avg>=70) {
		hak = "C학점";
	}else {
		hak = "F학점";
	}
}
//rank 의 값을 1로 만들는 메서드
public void play05() {
	rank = 1;
}

//변수가 private이므로 변수를 내보내는 메서드(get)
//이름
public String getName() {
	return name;
}
//총점
public int getSum() {
	return sum;
}
//평균
public double getAvg() {
	return avg;
}
//학점
public String getHak() {
	return hak;
}
//순위
public int getRank() {
	return rank;
}
//rank는 변수가 가진 데이터를 변경해야함(set)
public void setRank(int k1) {
	rank= k1;
}




   

}
