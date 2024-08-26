package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class Ex01_DOM2 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		Path path = Paths.get("E:", "nohssam02","util", "0826-2.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		HttpURLConnection conn = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			conn = (HttpURLConnection)url.openConnection();
			
			is = conn.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			// 화면에 출력
			// System.out.println(sb.toString());
			
			// 파일로 저장
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 파싱하기 
			// 1. 데이터를 파싱하기 위해서 저장하기 
			InputSource in = new InputSource(new StringReader(sb.toString()));
			
			// 2. DOM 방식으로 파서 만들기 (팩토리 패턴, 빌드패턴)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(in);
			
			// 원하는 태그 찾기
			// <weather year="2024" month="08" day="26" hour="09"> 년월일시 추출 
			// 하나라도 배열 취급해야 된다.
			 Element weather = (Element)document.getElementsByTagName("weather").item(0);
			 String y = weather.getAttribute("year"); 
			 String m = weather.getAttribute("month"); 
			 String d = weather.getAttribute("day"); 
			 String h = weather.getAttribute("hour"); 

			// NodeList => 배열로 취급하자
			NodeList locals = document.getElementsByTagName("local");
			
			// 추출 데이터를 저장하기 위해 필요
			StringBuffer sb2 = new StringBuffer();
			sb2.append("날짜 : ").append(y).append(". ")
			.append(m).append(". ").append(d).append(". ").append(h).append("시 \n");

			for (int i = 0; i < locals.getLength(); i++) {
				// 텍스트 추출
				String txt = locals.item(i).getFirstChild().getNodeValue();
				// 속성 추출
				String attr1 = ((Element)(locals.item(i))).getAttribute("ta");
				String attr2 = ((Element)(locals.item(i))).getAttribute("desc");
				
				sb2.append(txt+"\t");
				sb2.append(attr1+"\t");
				sb2.append(attr2+"\n");
			}
			// 화면에 출력
			System.out.println("도시\t온도\t상태");
			System.out.println(sb2.toString());
			
			// 지금은 파일로 저장, 나중에는 파싱한 내용을 DB에 저장
			bw.write(sb2.toString());
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
				conn.disconnect();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}


















