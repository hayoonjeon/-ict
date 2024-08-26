package com.ict.day19;

import java.net.InetAddress;
import java.net.UnknownHostException;

// InetAddress : 자바에서 IP주소를 표현하는 크래스
//               생성자가 있지만 사용하지 못함
//               6개의 static 메서드를 이용해서 생성한다.
//               localhost 란 현재 내가 사용하고 있는 컴퓨터를 말한다.
public class Ex09 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("이름 : " +  addr.getHostName());
			System.out.println("주소 : " +  addr.getHostAddress());
			System.out.println("toString : " +  addr.toString());
			System.out.println();
			
			addr = InetAddress.getByName("www.google.com");
			System.out.println("이름 : " +  addr.getHostName());
			System.out.println("주소 : " +  addr.getHostAddress());
			System.out.println("toString : " +  addr.toString());
			System.out.println();
			
			addr = InetAddress.getByName("m.google.com");
			System.out.println("이름 : " +  addr.getHostName());
			System.out.println("주소 : " +  addr.getHostAddress());
			System.out.println("toString : " +  addr.toString());
			System.out.println();
			
			InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
			for (InetAddress k : arr) {
				System.out.println("이름 : " +  k.getHostName());
				System.out.println("주소 : " +  k.getHostAddress());
				System.out.println("toString : " +  k.toString());
				System.out.println("=============");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
