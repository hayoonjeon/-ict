package com.ict.day25;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex08_JDBC {
	public static void main(String[] args) {
		// Scanner를 이용해서 
        // 고객의 이름과 주소를 받아서 둘리의 이름과 주소를 변경 후 
		// customer 테이블에 삽입 후 확인 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			
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
