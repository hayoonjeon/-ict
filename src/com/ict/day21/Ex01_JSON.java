package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

// JSON(JavaScript Object Notation)은 경량의 데이터 교환 방식으로,
// 인간이 읽고 쓰기 쉽고, 기계가 해석하고 생서하기 쉬운 텍스트기반의 데이터 포맷
// JSON은 데이터를 키-값 쌍의 구조로 표현 
//   - 객체 : JSON 객체는 '{}' 중괄호로 묶여 있으며, 키-값 쌍의 집합
//           { 키 : 값 , 키 : 값 , 키 : 값 , 키 : 값 ,키 : 값 }
//   - 배열 : JSON 배열은 '[]' 대괄호로 묶여 있음 순서가 있는 리스트
//           { 키 : [값, 값, 값, 값] , 키 : 값 ,  키 : 값}
//   - 데이터 타입 : 문자열, 숫자, 객체, 배열, Boolean

// 1. 라이브러리 다운받기 https://mvnrepository.com/ => gson
// 2. 원하는 위치(자기이름폴더 안에 util 폴더 안)에 라이브러리 붙여넣기 
// 3. 프로젝트 에서 마우스 오른쪽 - build path - configu build path - lib
public class Ex01_JSON {
	static final String MAKEUP = "http://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline";
	public static void main(String[] args) {
		Path path = Paths.get("E:", "nohssam02","util", "0827-1.txt");
		String pathName = path.toString();
		File file = new File(pathName);
		
		BufferedReader in = null;
		HttpURLConnection conn = null;
		try {
			// URL 연결 
			URL url = new URL(MAKEUP);
			conn = (HttpURLConnection)url.openConnection();
			// 주소창에 정보가 보이는 방식 , 속도가 빠르다
			// conn.setRequestMethod("GET");
			
			// 데이터 읽기
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String msg = null;
			while ((msg=in.readLine()) != null) {
				sb.append(msg);
			}
			
			// JSON 파싱
			// 시작이 배열
			Gson gson = new Gson();
			JsonArray jsonArray = gson.fromJson(sb.toString(), JsonArray.class);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
			// JSON 데이터 처리 및 출력
			for (JsonElement k : jsonArray) {
				// 자바에서 사용할 수 있게 JsonObject로 만들어준다.
				JsonObject product = k.getAsJsonObject();
				// .get(키)
				String id = product.get("id").getAsString();
				String brand = product.get("brand").getAsString();
				String name = product.get("name").getAsString();
				String price = product.get("price").getAsString();
				
				// %s => 문자열, %n => 줄 바꿈
				String output = 
						String.format("id: %s%nbrand: %s%nname: %s%nprice: %s%n-------------%n ",
								id,brand,name,price);
				System.out.println(output);
				writer.write(output);
				writer.flush();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				in.close();
				conn.disconnect();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}










