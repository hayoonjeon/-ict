package com.ict.day10;

import java.util.Iterator;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("학생수 ? >>");
        int cnt = scan.nextInt();
        //Ex17로 이루어진 클래스들의 모임 : 객체형 배열, 참조자료형 배열 > 클래스를 배열 
       
        //int[] arr = new int[cnt];
        Ex17[] arr = new Ex17[cnt]; //Ex17 클래스(짬뽕저장)식의 배열 만들기 
     
        for (int i = 0; i < arr.length; i++) { // 반복문을 통해 학생 정보 얻기
           Ex17 p = new Ex17();     //p는 클래스 Ex17...(한사람당 저장됨)
        	
        	System.out.print("이름 :");
        	String name = scan.next();
        	System.out.print("국어 :");
        	int kor = scan.nextInt();
        	System.out.print("영어 :");
        	int eng = scan.nextInt();
        	System.out.print("수학 :");
        	int math = scan.nextInt();
          
        	p.play01(name, kor, math,eng);// 값보내서 쭉쭊실행
        	
        	
        	
        	
        	
          arr[i] = p;  //메인에서 클래스형배열 arr에 p 저장.. 
        }
        
        // 순위
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum()<arr[j].getSum()) {
				int k1 = arr[i].getRank();
				k1++;
				arr[i].setRank(k1);
				}
			}
		}
        
        //정렬
      Ex17 tmp = new Ex17();
        for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank()>arr[j].getRank()) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
					
				}
			}
		}
        
        //출력
        
        System.out.println("이름\t총점\t평균\t학점\t순위");
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getSum()+"\t");
			System.out.print(arr[i].getAvg()+"\t");
			System.out.print(arr[i].getHak()+"\t");
			System.out.println(arr[i].getRank());
		}

      
        
      
        
        
      
    }
}
