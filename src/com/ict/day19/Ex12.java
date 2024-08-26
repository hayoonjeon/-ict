package com.ict.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;

// URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다.
public class Ex12 {
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0823-8.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		// 웹 사이트 가서 정보 읽어 오기 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		// 파일에 저장하려면 
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			URL url = new URL("http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline");
			// URLConnection conn = url.openConnection();
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			// 한줄이 읽어서 저장하기 
			String msg = null;
			// msg 를 append()를 이용해서 누적 저장하기  
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			// 화면에 출력
			// System.out.println(sb.toString());
			
			
			// 파일로 저장하기 
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}








