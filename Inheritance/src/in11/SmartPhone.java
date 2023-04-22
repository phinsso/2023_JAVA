package in11;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	
	// SmartPhone 클래스는 PDA 클래스를 상속 받고,
	// MobilePhoneInterface와 MP3Interface 인터페이스에 선언된 추상 메소드를 모두 구현한다
	
	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉");
	}
	
	@Override
	public void receiceCall() {
		System.out.println("전화가 왔습니다");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("문자 보냅니다");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("문자가 왔습니다");
	}
	
	// MP3Interface의 추상 메소드 구현
	@Override
	public void play() {
		System.out.println("음악 연주합니다");
	}
	
	@Override
	public void stop() {
		System.out.println("음악 중단합니다");
	}
	
	// 추가로 메소드 작성
	public void schedule() {
		System.out.println("일정 관리합니다");
	}
}
