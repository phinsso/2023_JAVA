package coll03;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		int sum = 0;
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		// Iterator it 는 객체변수는 v 객체변수의 iterator() 메소드에 의해서 객체가 생성된 것이다.
		// it는 v객체 데이터의 첫번째 요소를 가리키게 된다.
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) { // 각 번째 요소에 데이터가 존재하면 true 반환
			// it가 가리키는 요소에 데이터가 없으면 false 값을 반환
			int n = it.next();
			sum += n;
			System.out.println(n + " ");
		}
		System.out.println("\n벡터에 있는 정수의 합: " + sum);
	}

}
