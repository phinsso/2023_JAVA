package in08;

public class Circle extends Shape {
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape"; // 부모 클래스의 name 값을 변경
		super.draw(); // 부모 클래스의 draw()를 호출하는 것
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
	}
}
