package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex08_Input {
	public static void main(String[] args) {
		// 1.파일 저장위치 지정
		Path path = Paths.get("E:", "nohssam02", "util", "0823-5.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// 역 직렬화 : 직렬화 되기 이전 상태로 로 만들기 
			ArrayList<Ex08_VO> list = (ArrayList<Ex08_VO>) ois.readObject(); 
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex08_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				if(k.isGender()) {
					System.out.println("남성");
				}else {
					System.out.println("여성");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
