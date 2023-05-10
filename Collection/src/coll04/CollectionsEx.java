package coll04;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {

	static void printList(LinkedList<String> l) { // l이 myList 객체를 받는다
		Iterator<String> iterator = l.iterator(); // 순차적으로 접근하기 위함
		// Iterator: 반복자 (배열이나 자료구조의 내부를 순회하는 객체)
		
		while(iterator.hasNext()) { // iterator가 가리키는 곳에 데이터가 존재하면 true
			String e = iterator.next(); // iterator가 가리키는 곳의 데이터를 e에게 넘겨줌
			// 데이터를 넘겨준 후에 그 다음 데이터를 가리킴
			String separator;
			
			if(iterator.hasNext()) // hasNext(): 읽어올 요소가 있는지 확인 (있으면 true, 없으면 false)
				separator = "=>"; // 읽어올 요소가 있으면 => 후 다음 데이터 읽어옴
			else
				separator = "\n"; // 읽어올 요소가 없으면 줄바꿈
			System.out.print(e + separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		printList(myList);
		
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		printList(myList);
		
		Collections.sort(myList); // 오름차순 정렬
		printList(myList);
		
		Collections.reverse(myList); // myList에 들어있는 데이터를 역순으로 변경
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") + 1; // 인덱스는 0부터 시작이므로 +1
		System.out.println("아바타는 " + index + "번째 요소입니다.");

	}

}
