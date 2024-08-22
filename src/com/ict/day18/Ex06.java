package com.ict.day18;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// 스트림은 지연이 될수 있으므로 Buffer(임시기억)이용해서 지연 현상을 해결한다.
// BufferedInputStream , BufferedOutputStream , // 혼자서 사용 안됨
public class Ex06 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02", "util", "0822-2.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
















