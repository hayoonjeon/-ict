package com.ict.day26;

import java.util.Scanner;

public class Ex06_Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("선택하세요");
        System.out.println("1.customer 테이블 전체 데이터 보기");
        System.out.println("2.customer 테이블 특정 데이터 보기");
        System.out.println("3.customer 테이블 데이터 삽입");
        System.out.println("4.customer 테이블 특정 데이터 삭제");
        System.out.println("5.customer 테이블 특정 데이터 수정");
        System.out.print(">>>>>>>>>>>>>>>>   ");
        
        int menu = scan.nextInt();
        scan.nextLine();
        switch (menu) {
			case 1: Ex06_DAO.getInstance().getSelectAll(); break;
			case 2: 
				System.out.print("검색할 custid : " );
				int custid = scan.nextInt();
				Ex06_DAO.getInstance().getSelectOne(custid);
				break;
			case 3: 
				System.out.println("삽입할 정보를 입력하세요");
				System.out.print("이름 : " );
				String name = scan.nextLine();
				
				System.out.print("주소 : " );
				String address = scan.nextLine();
				
				System.out.print("전화번호 : " );
				String phone = scan.nextLine();
				
				Ex06_DAO.getInstance().getInsert(name, address, phone);
				
				break;
			case 4: 
				System.out.print("삭제할 custid : " );
				int custid2 = scan.nextInt();
				Ex06_DAO.getInstance().getDelete(custid2);
				
				break;
			case 5: break;
	
			default:  System.out.println("잘못 선택하셨습니다.");	break;
		}
	}
}







