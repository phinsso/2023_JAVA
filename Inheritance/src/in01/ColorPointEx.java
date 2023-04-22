package in01;

class Point {
	private int x, y; //한 점을 구성하는 x, y 좌표
	
	public void set(int x, int y) { //x, y를 매개변수로 받아서 좌표 변수 x, y에 대입
		this.x = x;
		this.y = y;
	} //return값이 없으므로 void형
	
	public void showPoint() { //점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color; //점의 색
	
	public void setColor(String color) { //color 문자열을 매개변수로 받아 점의 색으로 설정
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(color); //컬러 점의 좌표 출력
		showPoint(); //Point 클래스의 showPoint() 메소드 호출
	}
	
}

public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); //Point 클래스를 가리키는 객체변수 p의 객체 생성 (p라는 이름으로 접근)
		p.set(1, 2); //set 메소드을 호출하여 객체 p의 좌표 설정
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		//Point 클래스를 상속받은 ColorPoint 클래스를 가리키는 객체변수이기 때문에 Point 클래스에도 접근 가능함
		cp.set(2, 6);
		cp.setColor("red");
		cp.showColorPoint();
		//cp.x = 100; -> x, y는 private이기 때문에 접근 불가함
	}

}
