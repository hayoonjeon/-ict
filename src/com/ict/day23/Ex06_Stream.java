package com.ict.day23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex06_Stream {
	public static void main(String[] args) {
		// 파일의 내용을 읽어서 스트림 처리 하자 
		Stream<String> lines = null ;
		try {
			Path path = Paths.get("E:", "nohssam02", "util","0823-2.txt");
			String pathName = path.toString();
			File file = new File(pathName);
			
			// 파일의 내용을 읽어서 스트림으로 처리 
			lines =  Files.lines(path);
			// 한줄씩 읽어서 출력하겠다는 의미
			lines.forEach(i -> System.out.println(i));
			
		} catch (Exception e) {
			System.out.println();
		} finally {
			try {
				lines.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
