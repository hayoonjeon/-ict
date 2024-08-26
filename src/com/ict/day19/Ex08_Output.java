package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ex08_Output {
	public static void main(String[] args) {
		// 1. VO를 객체로 만들자
		Ex08_VO vo1 = new Ex08_VO("고길동", 35, 70.6, true);
		Ex08_VO vo2 = new Ex08_VO("희동이", 3, 30.12, false);
		Ex08_VO vo3 = new Ex08_VO("둘리", 24, 45.6, true);
		Ex08_VO vo4 = new Ex08_VO("마이콜", 21, 67.2, false);
		Ex08_VO vo5 = new Ex08_VO("도우너", 13, 24.6, true);

		// 2.파일 저장위치 지정
		Path path = Paths.get("E:", "nohssam02", "util", "0823-5.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			// 3. 여러개의 객체를 컬렉션(ArrayList)에 모으자 
			List<Ex08_VO> list = new ArrayList<Ex08_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			// 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
