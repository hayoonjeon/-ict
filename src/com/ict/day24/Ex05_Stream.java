package com.ict.day24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.ict.day01.Ex01;

public class Ex05_Stream {
	public static void main(String[] args) {
		Ex05_VO p1 = new Ex05_VO("마이콜" ,  20, 100);
		Ex05_VO p2 = new Ex05_VO("둘리" ,  40, 100);
		Ex05_VO p3 = new Ex05_VO("희동이" ,  13, 50);
		Ex05_VO p4 = new Ex05_VO("도우너" ,  30, 50);
		Ex05_VO p5 = new Ex05_VO("또치" ,  15, 50);
		
		List<Ex05_VO> list = new ArrayList<Ex05_VO>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		// 컬렉션으로 처리
		System.out.println("=== 고객명단 순서대로 출력 ===");
		for (Ex05_VO k : list) {
			System.out.println(k.getName());
		}
		System.out.println();
		
		int totalCost = 0;
		for (Ex05_VO k : list) {
			totalCost = totalCost + k.getPrice();
		}
		System.out.println("총 비용은 " + totalCost + " 입니다.");
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		for (Ex05_VO k : list) {
			if (k.getAge() >= 20) {
				System.out.println(k.getName());
			}
		}
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(나이 오름차순) ===");
		List<Ex05_VO> list2 = new ArrayList<>();
		for (Ex05_VO k : list) {
			if (k.getAge() >= 20) {
				list2.add(k);
			}
		}
		// 나이 순으로 오름차순 정렬 (선택 정렬 방식)
		for (int i = 0; i < list2.size() - 1; i++) {
			for (int j = i + 1; j < list2.size(); j++) {
				if (list2.get(i).getAge() > list2.get(j).getAge()) {
					// 두 요소 교환
					Ex05_VO tmp = list2.get(i);
					list2.set(i, list2.get(j));
					list2.set(j, tmp);
				}
			}
		}
	    for (Ex05_VO k : list2) {
	       System.out.println(k.getName());
	    }
		System.out.println("=====================================");
		
		// 스트림으로 처리 
		System.out.println("=== 고객명단 순서대로 출력 ===");
		// 리스트를 스트림으로 처리 하자 
		Stream<Ex05_VO> stream = list.stream();
		// stream.map(i -> i.getName()).forEach(i -> System.out.println(i));
		stream.forEach(i -> System.out.println(i.getName()+" 고객님"));
		System.out.println(); 
		
		int sum = list.stream().mapToInt(i -> i.getPrice()).sum();
		System.out.println("총 비용은 " + sum + "입니다.");
		System.out.println();
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(입력순) ===");
		stream = list.stream();
		stream.filter(i -> i.getAge() >= 20)
		.forEach(i-> System.out.println(i.getName()));
		System.out.println();
		
		
		System.out.println("=== 나이가 20이상인 고객의 명단 출력(오름차순) ===");
		stream = list.stream();
		stream
		.filter(i -> i.getAge() >= 20)
		.map(i -> i.getName())
		.sorted()
		.forEach(i -> System.out.println(i));
		
		
		
	}
}
