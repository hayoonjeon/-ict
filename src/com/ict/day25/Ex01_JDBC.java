package com.ict.day25;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.StatementEvent;



public class Ex01_JDBC {

	public static void main(String[] args) {
		// DB 접근하기 위해서 라이브러리가 필요함
		
		//java를 db에 접속할수있도록 도와주는 클래스
		Connection conn = null;
		//2. SQL 구문 작성 
		Statement stmt = null;
		
		//3.1 select 문일때
		ResultSet rs = null;
		//3.2 select문이 아닐때
		int result = 0;
		
		try {
			//4. jdbc 드라이버 로딩 : 오라클, mysql, mariadb  다다르다.
			//데이터베이스 연결정보
			Class.forName("com.mysql.cj.jdbc.Driver");
			

			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url,user,password);
			
			//7.sql 작성 
			//book 테이블에 있는 전체 내용 보기 
			String sql = "select * from book";
			
			//8. sql을 보내기 위해 구문 작성 
			
			stmt = conn.createStatement();
			
			// 9. 구문을 통해서 sql을 보내고 결과를 받는다.
			//9-1 결과가 select문일경우
			 rs = stmt.executeQuery(sql);
			 
			//9-2 결과가 select문이 아닐 경우 
			//result = stmt.executeUpdate(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4));
				
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
