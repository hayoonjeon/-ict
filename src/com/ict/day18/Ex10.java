package com.ict.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;

// PrintStream : 모든 자료형을 출력할 있는 print(), println() 메서드가 오버로딩 되어있다.
//               자바에서 텍스트 출력하는데 사용된다.
//               자동 플러시 기능과 예외처리를 하지 않는다.
public class Ex10 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0822-4.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		PrintStream ps = null;
		try {
			// 자동 플러시 : true
			ps = new PrintStream(new FileOutputStream(file), true);
			
			ps.println("Hello, World");
			ps.println(100);
			ps.println(true);
			ps.println('C');
			ps.print(45.987);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
