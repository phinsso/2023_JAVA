package pack06;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing: 기본 데이터를 객체 타입으로 변환 (자동)
		System.out.println("intObject = " + intObject);
		
		int m = intObject + 10; // 객체타입 데이터 + 기본 데이터 = 
		System.out.println("m = " + m);
	}
}
