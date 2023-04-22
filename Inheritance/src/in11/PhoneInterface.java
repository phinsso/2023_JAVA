package in11;

interface PhoneInterface {

	final int TIMEOUT = 10000; // 상수 필드 선언 (public static final 이 생략 가능)

	void sendCall(); // 추상 메소드

	void receiceCall(); // 추상 메소드

	default void printLogo() { // default 메소드 (인터페이스 중 코드가 작성된 메소드)
		System.out.println("** phone **");

	}
}
