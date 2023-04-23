package lib;

public abstract class Calculator { // 다른 패키지에서 접근할 수 있도록 public 삽입
	
	public abstract int add(int a, int b); // 추상 메소드
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
	
}
