package in05;

public class DownCastingEx {

	public static void main(String[] args) {
		Person p = new Student("이재문");
		//업캐스팅 (Person 클래스에는 기본 생성자만 있지만, Student 클래스가 Person 클래스를 상속받았기 때문에 재정의된 메소드(여기에선 생성자) 호출 가능
		Person p1 = new Person(); //p1객체 생성 (업캐스팅 발생 X)
		
		Student s, s1;
		
		//Student s2 = new Reaseracher(); //두 클래스는 형제관계(상속관계 X)이기 때문에 업캐스팅 불가

		s = (Student)p;
		//s1 = (Student)p1; //p1이 업캐스팅이 되지 않았기 때문에 다운캐스팅 불가
		
		System.out.println(s.name);
		s.grade =  "A";
		//System.out.println(s1.name);
		//s1.grade =  "A";
	}

}
