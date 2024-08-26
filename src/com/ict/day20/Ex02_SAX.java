package com.ict.day20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

// SAX(Simple API for XML) 파싱 
// : 이벤트 기반 파서로, XML 문서를 순차적으로 읽으며 특정 이벤트(시작태그, 끝태그, 텍스트)를 처리한다.
//   장점) 메모리 사용이 적으며, 큰 XML 문서 처리에 적합
//   단점) 문서의 구조를 기억하지 않으며, 무작위 접근이 불가능 
//        또한, 데이터를 저장하거나 처리하는데 있어 복잡할 수 있다.  
public class Ex02_SAX {
	
	 static FileWriter fw = null;
	 static BufferedWriter bw = null;
	 
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0826-3.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		HttpURLConnection conn = null;
		InputStream is = null;
		try {
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			conn = (HttpURLConnection)url.openConnection();
			is = conn.getInputStream();
			
			// 파일 저장
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 익명내부클래스 타입 
			DefaultHandler handler = new DefaultHandler() {
				StringBuffer sb2 = new StringBuffer();
				StringBuffer txt = new StringBuffer();
				boolean isLocal = false;
				String attr1 = "";
				String attr2 = "";
				
				// 시작 태그
				@Override
				public void startElement(String uri, String localName, String qName, Attributes attributes)
						throws SAXException {
					// qName => 태그이름,  attributes => 모든 속성을 포함하는 객체
					// 태그가 local 일때 실행 
					if(qName.equalsIgnoreCase("local")) {
						isLocal = true;
						txt.setLength(0); // 텍스트 부분 초기화
						attr1 = attributes.getValue("ta");
						attr2 = attributes.getValue("desc");
					}
				}
				
				// 텍스트
				@Override
				public void characters(char[] ch, int start, int length) throws SAXException {
					if(isLocal) {
						// 텍스트 추가 
						txt.append(new String(ch,start,length));
					}
				}
				
				// 끝 태그
				@Override
				public void endElement(String uri, String localName, String qName) throws SAXException {
					if(qName.equalsIgnoreCase("local")) {
						String cityName = txt.toString().trim(); // 도시 이름 완성
						sb2.append(cityName+"\t").append(attr1+"\t").append(attr2+"\n");
						isLocal = false;
					}
				}
				
				// 문서 끝
				@Override
				public void endDocument() throws SAXException {
					System.out.println("도시\t온도\t상태");
					System.out.println(sb2.toString());
					// 파일로 저장
					try {
						// final  => static
						bw.write(sb2.toString());
						bw.flush();
					} catch (Exception e) {
						System.out.println(e);
					} finally {
						try {
							bw.close();
							fw.close();
						} catch (Exception e2) {
							System.out.println(e2);
						}
					}
				}
			};
			
			// SAX 파서 생성
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			InputSource inputSource = new InputSource(new InputStreamReader(is));
			saxParser.parse(inputSource, handler);
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.disconnect();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
