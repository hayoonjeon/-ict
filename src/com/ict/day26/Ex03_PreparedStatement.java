package com.ict.day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03_PreparedStatement {
	public static void main(String[] args) {
		// DB에 접속할 수 있도록 도와 주는 클래스 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 마이콜 정보 삽입하기 (마이콜, 전라도, 010-1111-2222)
			String sql = "insert into customer(name, address, phone) "
					+ " values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "마이콜");
			pstmt.setString(2, "전라도");
			pstmt.setString(3, "010-7777-9999");
			
			result = pstmt.executeUpdate();
			if(result>0) {
				sql = "select * from customer";
				rs = pstmt.executeQuery(sql);
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
