package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03_JDBC {
	// customer 테이블에 6, 이강인, 대한민국 제주도, 010-1234-7890을 삽입
	public static void main(String[] args) {
		// 1. DB 접속해서 처리할 때 까지 필요한 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into customer( name, address, phone) "
					+ " values('이강인', '대한민국 제주도', '000-1234-7890')";

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql);
			if(result >0) {
				// System.out.println("삽입 성공");
				sql = "select * from customer" ;
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
		} catch (Exception e) {
			System.out.println("catch : " + e);
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
