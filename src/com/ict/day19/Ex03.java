package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// FileInputStream : 1byte, read() => 아스키코드(숫자)(숫자,대/소문자), 
//                          read(byte[] b), new String(byte[] b)
// FileReader : 2byte, read() => 유니코드(숫자)(전 세계문자표현 가능)
//                     read(char[] c) ,  new String(char[] b)   

public class Ex03 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0823-1.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// 한 글자 읽기 (숫자 => 형변환)
			// int k = fr.read();
			// System.out.println((char)(k));
			
			// 전체 읽기
			// int k = 0;
			// while ((k=fr.read()) != -1) {
			// 	  System.out.print((char)(k));
			// }
			
			char[] c = new char[(int) (file.length())];
			// 자동으로 배열에 파일의 내용이 저장된다.
			fr.read(c);
			
			// for (char k : c) {
			//   System.out.print(k);
			// }
			
			// trim() : 앞뒤 공백 제거
			String msg = new String(c).trim();
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}















