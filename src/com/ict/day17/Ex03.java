package com.ict.day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("주소", "함경도");
		map.put("취미", "운동");
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("취미"));
		System.out.println("===============");
		
		// 출력하기: keySet()
		for (String k : map.keySet()) {
			System.out.println(k);            // key
			System.out.println(map.get(k));   // value
			System.out.println("-------------");
		}
		System.out.println("===============");
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String k =  it.next();
			System.out.println(k);            // key
			System.out.println(map.get(k));   // value
			System.out.println("-------------");
		}
		
	}
}









