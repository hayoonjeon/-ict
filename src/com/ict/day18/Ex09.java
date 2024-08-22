package com.ict.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

// DataOutputStream , DataInputStream : 
//  - 기본자료형을 읽고 쓸수 있는 스트림
//  - 반드시 입력순서와 출력순서를 맞춰야 한다.

public class Ex09 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0822-3.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			// writeXX(값) => XX 자료형
			dos.writeInt(123);
			dos.writeBoolean(true);
			dos.writeDouble(45.79);
			dos.writeChar('H');
			dos.writeInt(98765);
			dos.flush();
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			int k1 = dis.readInt();
			boolean k2 = dis.readBoolean();
			double k3 = dis.readDouble();
			char k4 = dis.readChar();
			int k6 = dis.readInt();
			
			System.out.println(k1);
			System.out.println(k2);
			System.out.println(k3);
			System.out.println(k4);
			// System.out.println(k5);
			System.out.println(k6);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		

	}
}












