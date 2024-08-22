package com.ict.day18;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
	File 클래스 : 특정위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
	  - 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로)
	        						 File(File 상위경로, String 하위경로)
	  - 주요메서드 : createNewFile()   : 파일 생성
	              mkdir(), mkdirs() : 디렉토리 생성
	              delete            : 삭제
	              isFile()          : 파일이면 true
	              isDirectory()     : 디렉토리이면 true
	              exists()          : 있으면 true
	              getName()         : 이름 반환
	              length()          : 파일의 크기를 byte 로 변환(디렉토리는 크기가 없다.)
	              list()            : 특정위치의 내용을 String[] 로 만들어서 반환
	              getAbsolutePath() : 절대주소
	              getPath()         : 상대주소    	
 */
public class Ex01 {
	public static void main(String[] args) {
		String pathName = "E:\\nohssam02\\util"; // 윈도우
		String pathName2 = "E:/nohssam02/util";  // 리눅스나 맥
		
		// 운영체제와 상관없이 경로 표시 
		String pathName3 = "E:" + File.separator + "nohssam02" + File.separator + "util" ;
		Path path = Paths.get("E:", "nohssam02", "util");
		String pathName4 = path.toString();
		
		File file = new File(pathName4);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathName4, k);
			// System.out.println(file2);
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + k);
			}else {
				//     8     1024  1024   1024  1024  1024 
				// Bit -> Byte -> KB -> MB -> GB -> TB -> PB
				System.out.println("파일 : " + k + ", " +  k.length() + "Byte");
				System.out.println("파일 : " + k + ", " +  (int)(Math.ceil(( k.length()/1024.0))) + "KB");
			}
		}
	}
}



















