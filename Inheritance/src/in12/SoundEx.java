package in12;

public class SoundEx {

	public static void main(String[] args) {
		
		Sound tv = new TV(); // 변수에 new 다음에 오는 클래스를 연결시켜줌, 클래스가 새롭게 만들어지면서 새로운 저장소를 생성해줌 (TV는 Sound 인터페이스를 가리키는 객체 변수이지만, TV 클래스를 할당)
		Sound radio = new Radio(); // 인터페이스의 객체는 생성되지 않음 (인터페이스는 객체를 생성할 수 없음 (익명 객체 생성하며 오버라이딩 해줘야지 생성 가능) -> tv, radio는 객체로 볼 수 없음)
		tv.SoundUp(5); // tv 객체 변수는 TV 클래스에 있는 재정의된 SoundUp() 메소드를 호출
		tv.SoundDown(10);
		radio.SoundUp(5);
		radio.SoundDown(10);

	}

}
