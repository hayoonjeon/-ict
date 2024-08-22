package com.ict.day17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex01 {
	public static void main(String[] args) {
		// Queue 인터페이스 : FIFO (먼저 들어온 데이터가 먼저 나감)
		//       구현 클래스 : LinkedList(멀티 스레드 동기화 안됨)
		
		// 생성
		LinkedList<String> linkedList = new LinkedList<String>();
		Queue<String> linkedList2 = new LinkedList<String>();
		
		// 추가, 삽입 : add, addFirst, addLast, offer, offerFirst, offerLast
		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.add("마이콜");
		linkedList.addFirst("둘리");
		linkedList.addLast("희동이");
		// 중복가능
		linkedList.add("마이콜");
		System.out.println(linkedList);
		
		// 특정위치 요소 추출
		System.out.println(linkedList.get(3));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		// 마이콜을 공실이로 변경하자
		if(linkedList.contains("마이콜")) {
			linkedList.set(linkedList.indexOf("마이콜"), "공실이");
		}
		System.out.println(linkedList);
		
		// 삭제하기 : remove(Object o), remove(int index), removeFirst(),removeLast()
		System.out.println(linkedList.remove("둘리"));
		System.out.println(linkedList);
		
		System.out.println(linkedList.remove(2));
		System.out.println(linkedList);
		
		// 출력하기 
		for (String k : linkedList) {
			System.out.println(k + "^^");
		}
		System.out.println();
		
		Iterator<String> it = linkedList.iterator();
		while (it.hasNext()) {
			String k =  it.next();
			System.out.println(k+"&&");
		}
	}
}



























