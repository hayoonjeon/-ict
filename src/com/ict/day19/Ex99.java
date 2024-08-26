package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Path;
/*
 * 객체의 정보를 담을 수있는 멤버 변수로 구성 
 * vo  : 데이터 저장하느 ㄴ객체. 객체불변 ,.생성자로 데이터 초기ㅗ하 get만조냊
 * dto : 데이터전송을 ㅜ이해 사용하는 객체. get set 모두존재
 * 
 * 1.serializable 인터페이스 구현 ( 추상메서드 없다_ 
 * 모든 멤버필드가 객체 직렬화 대상이 된다.
 * 만약에 특정 멤버 제외시키려면 멤ㅇ버앞에 transient 예약어 사용.
 * transient 사용한 멤버는 String 은 null, int는 0,
 * double 은 0.0, boolean 은 false  
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class Ex99 {
	public static void main(String[] args) {
		
		Ex07_VO vo1 = new Ex07_VO("고길동", 35, 70.6, true);
		Ex07_VO vo2 = new Ex07_VO("희동이", 3, 30.12, false);
		Ex07_VO vo3 = new Ex07_VO("둘리", 24, 45.6, true);
		Ex07_VO vo4 = new Ex07_VO("마이콜", 21, 67.2, false);
		Ex07_VO vo5 = new Ex07_VO("도우너", 13, 24.6, true);
		
		Path path = Paths.get("D:","Hayoon","util","0823-4.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			
			List<Ex07_VO>list = new ArrayList<Ex07_VO>();
			
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
		}
		
		
		
		
		
		
		
		
	}

	
	
}
