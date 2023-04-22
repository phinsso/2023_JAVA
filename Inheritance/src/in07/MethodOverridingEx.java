package in07;

public class MethodOverridingEx {
	static void paint(Shape p) { //클래스 메소드 paint: 클래스 메소드는 따로 객체 생성 없이 메소드 이름으로 호출 가능
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line(); // line 객체 생성
		paint(line); // Shape p = line (Line이 Shape를 상속받았기 때문에 업캐스팅 된 것) / p.draw는 Line 클래스의 draw 메소드가 호출된 것
		paint(new Shape()); //Shape p = new Shape() / p.draw는 Shape 클래스의 draw 메소드가 호출된 것(업캐스팅 X)
		paint(new Line()); //Shape p = new Line() (업캐스팅) / Line 클래스의 draw 메소드가 호출
		paint(new Rect()); // Shape p = new Rect() (업캐스팅) / Rect 클래스의 draw 호출
		paint(new Circle()); //Shape p = new Circle() (업캐스팅) / Circle 클래스의 draw 호출

	}

}
