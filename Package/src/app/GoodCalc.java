package app;

import lib.Calculator;

public class GoodCalc extends Calculator {
	@Override // 어노테이션 (코드 사이에 주석처럼 쓰임) -> 밑의 메소드는 재정의 된 메소드임을 명시하는 것
	public int add(int a, int b) {
		return a + b; // 추상 메소드를 재정의하여 구현
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public double average(int[] a) { // int[] a = new int[] {2, 3, 4} 와 같은 표현
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2, 3, 4})); // 배열도 하나의 객체이므로 new 키워드 써야 함

	}

}
