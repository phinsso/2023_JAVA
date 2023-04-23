package coll01;

import java.util.Vector;

public class VectorEx {

	public static void printVector(Vector<Integer> v2) {
		for(int i = 0; i < v2.size(); i++) {
			int n = v2.get(i);
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		// 기본적인 용량 = 10개
		// v는 벡터 클래스의 객체변수로, 데이터는 정수를 담는 것으로 10개의 기억공간이 만들어짐
		// Vector() 생성자에 의해서 10개의 기억공간이 만들어진다.
		
		v.add(5); // 인덱스 0번째에 5 삽입
		v.add(4); // 인덱스 1번째 4 삽입
		v.add(-1); // 인덱스 2번째 -1 삽입
		v.add(2, 100); // 인덱스 2번째 100 삽입, 원래 2번째 이후의 모든 데이터는 자동으로 뒤로 이동
		// 0: 5, 1: 2, 2: 100, 3: -1
		
		System.out.println("벡터 내의 요소 객체의 수: " + v.size()); // 데이터가 저장되어 있는 개수
		System.out.println("벡터의 현재 용량: " + v.capacity()); // 전체용량
		
//		for(int i = 0; i < v.size(); i++) {
//			int n = v.get(i);
//			System.out.println(n);
//		}
		
		printVector(v); // 메소드 호출되는데 파라미터 값은 v 객체 -> 받는 쪽도 같은 자료형이어야 함

	}

}
