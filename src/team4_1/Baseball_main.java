package team4_1;

import java.util.Scanner;

public class Baseball_main {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Baseball01 t1 = new Baseball01(); //컴터숫자생성클래스 
		//중복검사기도 여기있음 
		int cnt = 0; // 입력수(회차) 초기값 0 설정 
		t1.randNumGenerator();  // 컴퓨터숫자 불러오기 
		int[] com = t1.randNumGenerator(); //int[] com배열 선언
	esc:	while(true) {
			
		
		Baseball02 t2 = new Baseball02(); //입력수 클래스 불러오기
		
		t2.play01();//  내 입력수 메서드 진행 
		t2.getUser();// 내 입력수 불러오기.(private 수여서) 
		int[] user = t2.getUser(); //int[] user 배열 선언. 
		
		Baseball03 t3 = new Baseball03(com, user);
		
		int strike = t3.getStrikeNum();
		int ball = t3.getBallNum();
		int out = t3.getOutNum();
		
		int accuracy = strike + ball;
	    out = 3 - accuracy;
	    

	    cnt++;
	    System.out.println(cnt + "회차 : " + strike + 
	    		" Strike,\t" + ball + " Ball,\t" + out + 
	    		" Out\n" + "입력한 수: {" + user[0]+","
	            + user[1]+"," + user[2]+"}"  + 
	            "\n컴퓨터 수: {" + com[0]+","
	            + com[1]+"," + com[2]+"}");
	    if (strike == 3) {
	        System.out.println("3 스트라이크! 게임을 종료합니다.");
	        strike = 0;
		    ball = 0;
		    while (true) {
				
				
			    System.out.println("재도전 하시겠습니까? y/n" );
			    String input = scan.next();
			    if (input.equalsIgnoreCase("y")) {
					continue esc  ;
				} else if (input.equalsIgnoreCase("n")) {
					System.out.println("수고하셨습니다.");
				break esc;
			    }else{
					System.out.println("y와 n중에서만 입력해주세요");
				
				}
			    }
	     
	    }
	   
	    		
	  

	}
	}
		

		
		
		
		
	

}
