package com.ict.day19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// FileReader : 2byte, read() => 유니코드(숫자)(전 세계문자표현 가능)
//                     read(char[] c) ,  new String(char[] b)

// BufferedReader : readLine() : 한줄씩 읽는다. 더 이상 읽을 수 없을때 null;  
public class Ex04 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0823-2.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}















