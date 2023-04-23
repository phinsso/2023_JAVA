package in06;

public class InstanceOfEx {

	static void print(Person p) { //static이 붙은 메소드 -> 클래스 메소드 (객체로 접근하지 않아도 호출 가능함)
		if(p instanceof Person)
			System.out.println("Person 객체 타입");
		if(p instanceof Student)
			System.out.println("Student 객체 타입");
		if(p instanceof Researcher)
			System.out.println("Researcher 객체 타입");
		if(p instanceof Professor)
			System.out.println("Professor 객체 타입");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() --> \t"); print(new Student()); // == Person p = new Student();
		System.out.print("new Researcher() --> \t"); print(new Researcher()); // == Person p = new Researcher();
		System.out.print("new Professor() --> \t"); print(new Professor()); // == Person p = new Professor();

	}

}
