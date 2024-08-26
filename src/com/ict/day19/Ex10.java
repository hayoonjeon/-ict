package com.ict.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

// URL(Uniform Resource Locator) : 인터넷 에서 접근 가능한 자원의 주소 
// URL  클래스는 원격 서버의 자원의 결과만을 가져온다.
// final 클래스 이므로 상속 안됨
public class Ex10 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Path path = Paths.get("E:", "nohssam02","util", "0823-6.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		try {
			URL url = new URL("https://v.daum.net/v/20240823131500733");
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			// String result = null;
			// String 에 여러 번 + 사용하면 메모리에 쓸데 없는 공간이 만들어진다.
			// 그것을 해결하기 위해서 StringBuffer 나 StringBuilder를 사용한다.
			// append()로 추가하면 된다.
			StringBuffer result = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				// 화면에 출력
				// System.out.println(msg);
				// result = result + msg+"\n" ;
				result.append(msg+"\n");
			}
			// 파일 저장
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// Stringbuffer 사용하였으므로 .toString()이용해서 String으로 만들어준다.
			bw.write(result.toString());
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
			}
		}
	}
}
