package com.ict.day17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		// Map 인터페이스 : Key와 Value를 1:1 매핑하는 구조
		//               Key를 호출하면 Value가 온다.   
		//               Key는 중복될 수 없다. (기존 value에 덮어쓰기 된다.)
		//               Key를 별도로 관리(Set에서 관리) => keySet()
		//               add()관련된 메서드로 추가/삽입를 할 수 없다.
		//               put(Key, Value) 로 추가
		//     관련클래스 : HashMap 
		
		// 1.생성
		// Key 가 숫자인 경우
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(0,"한국");
		map1.put(1,"영국");
		map1.put(2,"태국");
		map1.put(3,"미국");
		map1.put(10,"중국");
		// value 는 중복가능
		map1.put(13,"한국");
		// key 는 중복 불가능하다. (value 를 덮어쓰기 한다)
		map1.put(10,"필리핀");
		
		System.out.println(map1);
		
		// 추출하기 
		// 1. 요소 하나 추출하기 : get(key)
		System.out.println(map1.get(3));
		// 키가 없으면 null
		System.out.println(map1.get(8));
		System.out.println();
		
		// 순서대로 여러개 추출 : keySet()
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k) + " ^^");
		}
	    System.out.println();
	    
	    Iterator<Integer> it = map1.keySet().iterator();
	    while (it.hasNext()) {
			Integer k = it.next();
			System.out.println(map1.get(k) + " @@");
		}
	    System.out.println();
	    
	    // value만 구하기 
	    Collection<String> v =  map1.values();
	    System.out.println(v);
	    
	    // entrySet() 는 key와 value 모두 필요한 경우 사용
	    Set<Entry<Integer, String>> set1 =  map1.entrySet();
	    Iterator<Entry<Integer, String>> it2 = set1.iterator();
	    while (it2.hasNext()) {
			Entry<Integer, String> entry =  it2.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
	}
}








