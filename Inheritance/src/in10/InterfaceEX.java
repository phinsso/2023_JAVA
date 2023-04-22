package in10;

public class InterfaceEX {

	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo(); // default 메소드이기 때문에 자동 상속
		phone.sendCall();
		phone.receiceCall();
		phone.flash(); // SamsungPhone 클래스의 flash 메소드
	}

}
