package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex99 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	int result = 0;
	
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		
		String url = "jdbc:mysql://localhost:3306/ictedu_db";
		String user = "ictedu";
		String password = "1111";
		
		System.out.println("이름");
		String name = scan.nextLine();
		System.out.println("주소");
		String address = scan.nextLine();
		System.out.println("폰번");
		String phone = scan.nextLine();
		
		
		conn = DriverManager.getConnection(url, user, password);
		stmt = conn.createStatement();
		String sql = "INSERT customer(name,address,phone) "
				+ "VALUES('"+name+"','"+address+"','"+phone+"')";
		result = stmt.executeUpdate(sql);
		
		if (result>0) {
			sql="select * from customer";
			rs=stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
			
		}
				
	
	
		
		
		
		
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		
		
		
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
