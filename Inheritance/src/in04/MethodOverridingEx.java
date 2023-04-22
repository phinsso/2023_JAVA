package in04;

public class MethodOverridingEx {

	public static void main(String[] args) {
		Rect r = new Rect(); //자식클래스(Rect)를 가리키는 객체변수 r (할당까지 됨)
		Shape s = r; //부모클래스(Shape)를 가리키는 객체변수(선언만 함) s에 r을 대입 -> 업캐스팅
		//위 문장은 Shape s = new Rect(); 로 표현해도 됨
		
		System.out.println(s.a); //Shape에서 a = 123
		System.out.println(s.b); //Shape에서 b = 456.678
		s.draw(); //Shape를 상속받은 Rect 클래스의 draw() 메소드가 호출됨
		//상속받은 후 draw 메소드를 재정의했기 때문에 Rect 클래스의 메소드가 호출된 것임
		s.draw2(); //Shape의 메소드 (Rect에는 없음)
		
		//s.draw3();
		//Shape 클래스에 draw3() 메소드를 정의하지 않았기 때문에 에러가 남
		

	}

}
