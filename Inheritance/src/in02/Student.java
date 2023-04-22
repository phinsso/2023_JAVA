package in02;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175; // protected -> 같은 패키지 내여서 접근 가능
		//weight = 99; -> private이어서 접근 불가
		setWeight(99);
	}
}
