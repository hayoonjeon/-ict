package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06_JDBC {
	public static void main(String[] args) {
		// Scanner를 이용해서 
        // 이름, 주소, 전화번호를 받아서 customer 테이블에 삽입 후 확인
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("주소 : ");
		String address = scan.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = scan.nextLine();
		
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			String sql = "insert into customer(name,address, phone) "
					+ " values('"+name+"', '"+address+"', '"+phone+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result>0) {
				sql = "select * from customer";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
				
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
