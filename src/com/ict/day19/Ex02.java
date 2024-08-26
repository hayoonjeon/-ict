package com.ict.day19;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// FileWriter       => 2byte씩 처리, write(int c), write(char[] c), write(String str),  유니코드
// BufferedWriter : newLine() => 줄바꿈
public class Ex02 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0823-2.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// FileOutputStream(file, true); => 이어쓰기
			// FileWriter(file,true);  => 이어쓰기
			// FileOutputStream(file); => 덮어쓰기
			// FileWriter(file);       => 덮어쓰기
			fw = new FileWriter(file, true);
		    bw = new BufferedWriter(fw);
		    bw.write("안녕하세요");
		    bw.newLine();
		    bw.write("123123123");
		    bw.newLine();
		    bw.write("Hello ~~ ");
		    
		    bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}









