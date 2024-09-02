package com.ict.day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_JDBC {
	public static void main(String[] args) {
	// DB 접근하기 위해서는 라이브러리가 필요하다.
	// https://dev.mysql.com/downloads/connector/j/
	// "Platform Independent" 선택 => zip 선택 후 다운로드
    // 압축해제 후 프로젝트 lib 안에 mysql-connector-java-9.0.0.jar 넣기
		
		// 1. java를 DB에 접속 할 수 있도록 도와 주는 클래스
		Connection conn = null;
		
		// 2. SQL 구분 작성 
		Statement stmt = null;
		
		// 3-1. select문
		ResultSet rs = null; 
		// 3-2. select문이 아닐 때 
		int result = 0 ;
		
		try {
			
			// 4. jdbc 드라이버 로딩 : 오라클, MySQL, MariaDB 다 다르다.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			// 5. 데이터베이스 연결 정보
			String url = "jdbc:mysql://localhost:3306/ictedu_db";
			String user = "ictedu";
			String password = "1111";
			
			// 6. 접속
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. SQL 작성
			// book  테이블에 있는 전체 내용 보기 
			String sql = "select * from book";
			
			// 8. sql를 보내기 위해 구문 작성 
			stmt = conn.createStatement();
			
			// 9. 구분을 통해서 sql를 보내고 결과를 받는다.
			// 9-1. select 일 경우
			rs = stmt.executeQuery(sql);
			
			// 9-2. select가 아닐 경우
			// result = stmt.executeUpdate(sql);
			
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getInt(4));
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
