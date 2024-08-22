package com.ict.day18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex02 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02", "util", "exam01.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				// 해당 위치에 같은 파일명이 있을 때 
				System.out.println("파일 생성 실패");
			}
			System.out.println();
			
			// 성공
			// Path path2 = Paths.get("E:", "nohssam02", "util", "study");
			Path path2 = Paths.get("E:", "nohssam02", "util", "study2","java");
			String pathName2 = path2.toString();
			File file2 = new File(pathName2);
			// 중간 디렉토리가 없으면 생성할 수 없다.
			// boolean b2 = file2.mkdir();
			
			// 중간에 디렉토리가 없으면 생성 해준다.
			boolean b2 = file2.mkdirs();
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}
			System.out.println();
			
			// 파일 삭제 대상 ; pathName = > file
			boolean b3 = file.delete();
			if(b3) {
				System.out.println("파일삭제 성공");
			}else {
				System.out.println("파일삭제 실패");
			}
			
			// 디렉토리 삭제 : 비어있지 않으면 실패
			Path path3 = Paths.get("E:", "nohssam02", "util", "study2", "java");
			String pathName3 = path3.toString();
			File file4 = new File(pathName3);
			boolean b4 =file4.delete();
			if(b4) {
				System.out.println("디렉토리삭제 성공");
			}else {
				System.out.println("디렉토리삭제 실패");
			}
			
		} catch (IOException e) {
			// 경로가 틀렸을 때 
			e.printStackTrace();
		}
		
	}
}
