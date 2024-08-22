package com.ict.day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex04 {
	public static void main(String[] args) {
		// 바이트 입력 스트림 : InputStream 자식 클래스 FileInputStream 사용
		//  - FileInputStream : 해당 파일에 내용을 1byte 씩 읽기
		//  - FileInputStream 주요 메서드
		//      1. read() : int => 숫자(아스키코드(0-255)), 한 글자 
		//                         해당 숫자를 문자로 보려면 char 형변환 해야 된다.
		//                         만약에 읽을 수가 없으면 -1 이 나온다.
		//      2. read(byte[] b) : 읽어서 배열에 넣기 
		//                          String 생성자에서 byte[] 받는 생성자가 있다. 
		//                          String str = new String(byte[]b) ;
		//      3. close() : 입력 스트림 닫기
		Path path = Paths.get("E:", "nohssam02", "util", "0822-1.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			
			// 1. byte 읽기(숫자, 소문자, 대문자 => 한 글자 읽기)
			// int b = fis.read();
			// System.out.println(b);
			// System.out.println((char)(b));
			
			// 2. 파일 안에 있는 모든 글자 읽기 : 한글, 한자 안됨
			//    나중에 그림파일, 동상영파일, 음악파일 등을 복사, 잘라내기, 붙이기 할때 필요
			// int b = 0 ;
			// while (true) {
			// 	  b = fis.read();
			//	  if(b == -1) {
			//		break;
			//    }
			//	 System.out.print((char)(b));
			// }
			
			// int b=0;
			// while ((b=fis.read()) != -1) {
			//    System.out.print((char)(b));
			// }
			
			// 2. byte[] 이용
			// byte[] b = new byte[(int)(file.length())];
			// 파일 내용을 읽어서 byte[] b 에 넣어주세요  
			// fis.read(b);
			// for (byte k : b) {
			//	 System.out.print((char)(k));
			// }
			
			// 3. new String(byte[] b)
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
















