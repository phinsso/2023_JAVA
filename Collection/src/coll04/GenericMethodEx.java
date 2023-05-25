package coll04;

public class GenericMethodEx {
	
	public static <T> GStack<T> reverse(GStack<T> a) { // a는 gs객체를 받음
		// <T>: 특정 메소드에 제네릭을 적용하겠다는 표시
		// GStack<T>: reverse() 메소드의 리턴 타입
		// reverse(GStack<T> a)에서 a는 GStack 클래스 객체변수
		
		GStack<T> s = new GStack<T>(); // GStack 클래스의 객체 s 생성
		
		while(true) {
			T tmp;
			tmp = a.pop(); // 4.0, 3.0, 2.0, 1.0, 0.0 순으로 읽어서 tmp에 저장
			// 객체변수 a에 저장되어 있는 데이터를 하나씩 읽어서 tmp에 저장
			
			if(tmp == null) break;
			else s.push(tmp);
		}
		
		return s;
	}

	public static void main(String[] args) {
		GStack<Double> gs = new GStack<Double>();
		
		for(int i = 0; i < 5; i++) {
			gs.push(Double.valueOf(i)); // 저장할 때는 0.0, 1.0, 2.0, 3.0, 4.0 순으로 저장
		}
		
		gs = reverse(gs); // reverse(gs)가 reverse() 메소드의 s객체를 전달 받아서 gs에게 넘겨줌
		
		for(int i = 0; i < 5; i++) {
			System.out.println(gs.pop());
		}

	}

}
