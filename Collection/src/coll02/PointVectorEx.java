package coll02;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2, 3)); // 데이터가 삽입이 되는데 Point() 생성자 메소드에 의해서 x, y값이 저장됨
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		for(int i = 0; i < v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p); // Point 클래스에 있는 toString() 메소드가 호출
		}
	}

}
