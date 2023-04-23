package coll04;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {

	public static void main(String[] args) {
		
		// HashMap 객체 생성하는데 key의 데이터 타입은 String
		// value의 데이터 타입도 String인 dic 객체 생성
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3개의 (key, value)쌍을 dic 객체에 저장
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();
			
			// if(eng == "exit) -> 문자열의 주소값을 비교하는 것임! 헷갈리지 않기
			if(eng.equals("exit")) { // 문자열 자체의 값을 비교
				System.out.println("종료합니다.");
				break;
			}
			
			String kor = dic.get(eng);
			if(kor == null)
				System.out.println(eng + "는 없는 단어입니다");
			else
				System.out.println(kor);
		}
		sc.close();

	}

}
