package team4_1; //패키지 이름은 임의로 했습니다.

import java.util.Scanner;

public class Baseball02 {
	Scanner scan = new Scanner(System.in);
	
	private int[] user = new int[3]; // 유저의 수 배열로 선언

	public int[] getUser() { // user getter
		return user;
	}

	public void setUser(int[] user) { // user setter
		this.user = user;
	}
	
	
	public void play01() { // 유저의 수 입력받고 비교하는 메서드
	for (int i = 0; i < user.length; i++) { //0 1 2  배열 포문 
        System.out.println((i+1) + " 번 숫자 입력 : ");
        user[i] = scan.nextInt(); //입력수는 user[0] 부터 진행. 
        if (user[i] > 9 || user[i] == 0 ) {
			System.out.println("1 ~ 9 까지의 수만 입력하세요.");
			--i; 		// 잘못입력하면 카운팅된 i를 줄인다. (초기화)
			continue;
		}
            for (int j = 0; j < i; j++) {
            	//i가 0일떈 j 검사X, user[1]가 1일땐 user[0]과 검사
            	//i가 2일떈 user[2]와 user[0~1] 중복검사. 
                if(user[i] == user[j]) {
                    System.out.println("중복된 숫자입니다. 다시 입력하세요.");
                    --i;//중복되었으면 i 감소시키고 다시 진행해야함 
                    break;//중복되엇을경우 다시진행 
                }
            }
        }
	}
}
