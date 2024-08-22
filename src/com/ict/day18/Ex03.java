package com.ict.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
   스트림 : 데이터를 원하는 목적지 까지 입/출력 하는 방법
    종류 : 바이트스트림, 문자스트림, 결합스트림, 오브젝트스트림
    1. 바이트 스트림 : 모든 처리를 1byte 처리 (기계위주)
             대상 : 바이트로 이루어진 모든 파일(사진, 동영상, 소리)
       최상위 클래스 : InputStream(입력), OutputStream(출력)
       
    2. 문자 스트림 : 모든 처리를 2byte 처리 (사람위주)
            대상 : 세계 모든 문자로 구성된 파일
      최상위 클래스 : Reader(입력), Writer(출력)
      
    3. 결합스트림 : 바이트 스트림 <===> 문자스트림
                 기계를 통한 입/출 된 정보를 사람이 알아볼 수 있도록 입/출력 한다.
      최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
      
    4. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입/출력
               대상 : 객체
        최상위 클래스 : ObjectInputStream(readObject() => 객체 역 직렬화)                   
        			 ObjectOutputStream(writeObject() => 객체 직렬화)
 */
public class Ex03 {
	public static void main(String[] args) {
	// 바이트 출력 스트림 : OutputStream 자식 클래스 FileOutputStream 사용
	//  - FileOutputStream 은 해당 파일에 내용을 1byte 씩 출력(쓰기)
	//  - FileOutputStream 주요메서드
	//    1. write(int b) : int => 숫자(아스키코드(0-255), 한 글자 
	//                      아스키 코드 -> 숫자, 대/소문자 , 일부 특수문자만 가능
	//    2. write(byte[] b) : 배열 b에 존재하는 아스키 코드 출력
	//                        String 클래스 getBytes()를 이용하면 byte[]로 만들어진다.	
	//    3. flush() : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만드는 메서드
	//    4. close() : 출력 스트림 닫기
		
	//  파일 만들 경로 지정 : path
		Path path = Paths.get("E:", "nohssam02", "util", "0822-1.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		try {
			// 파일이 존재하면 덮어쓰기가 된다. 존재하지 않으면 생성된다.
			fos = new FileOutputStream(file);
			fos.write(97);
			fos.write(13); // 줄 바꾸기
			
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(13); // 줄 바꾸기
			
			String msg ="Hi~~~\n안녕\n大韓\n12345\nBye~~";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
















