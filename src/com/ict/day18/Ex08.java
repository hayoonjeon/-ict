package com.ict.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex08 {
	public static void main(String[] args) {
		// 입력
		Path path = Paths.get("E:", "nohssam02", "cup.jpg");
		String pathName = path.toString();
		File in_file = new File(pathName);
		
		// 출력
		Path path2 = Paths.get("E:", "nohssam02", "util", "cup.jpg");
		String pathName2 = path2.toString();
		File out_file = new File(pathName2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(in_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(out_file);
			bos = new BufferedOutputStream(fos);
			
			int b = 0 ;
			while ((b=bis.read()) != -1) {
				bos.write(b);
			}
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			// close 이후에 삭제 해야 되다. 
			// 원본 삭제하기 
			in_file.delete();
			
		}
		
	}
}
