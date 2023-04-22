package in10;

public class SamsungPhone implements PhoneInterface { // 인터페이스를 implements 받은 클래스는 인터페이스의 추상 메소드를 모두 구현해야 함 (강제 구현의 성질을 띄고 있음)

	@Override
	public void sendCall() {
		System.out.println("띠리링 띠리링~");
	}

	@Override
	public void receiceCall() {
		System.out.println("전화가 왔습니다!");
	}
	
	// 추가 메소드 작성
	public void flash() {
		System.out.println("손전등 기능이 켜졌습니다.");
	}

}
