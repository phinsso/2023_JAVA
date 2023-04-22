package in03;

public class ColorPoint extends Point {
	
	private String color; //점의 색
	
	public ColorPoint(int x, int y, String color) {
		super(x, y); //super : 부모(상위 클래스)의 생성자를 불러오고 싶을 때 사용 !!첫 줄에 사용!!
		//상위 클래스(Point)의 생성자 중에서 정수 2개를 매개변수로 갖는 생성자를 호출함
		this.color = color;
		//super(); -> super()는 생성자 메소드 안에서 한 개만 호출 가능하기 때문에 이 문장은 불가함
	}
	
	public void setColor(String color) { //color 문자열을 매개변수로 받아 점의 색으로 설정
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color); //컬러 점의 좌표 출력
		showPoint(); //Point 클래스의 showPoint() 메소드 호출
	}
}
