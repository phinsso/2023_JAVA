package coll04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {

	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap 요소의 개수: " + javaScore.size());
		
		Set<String> keys = javaScore.keySet(); // key 문자열을 가진 집합 Set 컬렉션 리턴
		
		Iterator<String> it = keys.iterator(); // key 문자열을 순서대로 접근할 수 있는 반복자 리턴
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name + " : " + score);
		}
	}

}
