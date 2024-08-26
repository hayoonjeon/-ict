package com.ict.day19;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

// PrintStream은 모두 데이터 출력 가능
// PrintWriter은 모든 데이터 출력 가능, (바이트 출력과 문자 출력 둘 다 가능)  
public class Ex05 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0823-3.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		// 문자 출력
		FileWriter fw = null;
		PrintWriter pw = null;
			
		FileOutputStream fos = null;
		PrintWriter pw2 = null;
		try {
			// 문자 출력
			fw = new FileWriter(file);
			pw = new PrintWriter(fw, true);
			pw.println("PrintWriter 연습");
			pw.println(true);
			pw.println(123);
			pw.println(458.1234);
			pw.println('C');
			
			// 바이트 출력
			fos = new FileOutputStream(file);
			pw2 = new PrintWriter(fos, true);
			pw2.println("PrintWriter 연습2");
			pw2.println(true);
			pw2.println(123);
			pw2.println(458.1234);
			pw2.println('C');
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pw2.close();
				fos.close();
				pw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}












