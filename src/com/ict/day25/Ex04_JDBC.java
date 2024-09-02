package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04_JDBC {
	public static void main(String[] args) {
		// 이름이 '이강인' 고객 삭제(delete 문) 후 customer 테이블 확인(select문)
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
			String sql = "delete from customer where name='이강인'";
			
			stmt = conn.createStatement();
			
			// sql 문이 insert, update, delete 는 무조건 int 형
			result = stmt.executeUpdate(sql);
			
			if(result>0) {
				sql = "select * from customer";
				//stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.println(rs.getString(4));
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
