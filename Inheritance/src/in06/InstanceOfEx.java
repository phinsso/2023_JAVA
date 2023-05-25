package in06;

public class InstanceOfEx {

	static void print(Person p) { //static이 붙은 메소드 -> 클래스 메소드 (객체로 접근하지 않아도 호출 가능함)
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() --> \t"); print(new Student()); // == Person p = new Student();
		System.out.print("new Researcher() --> \t"); print(new Researcher()); // == Person p = new Researcher();
		System.out.print("new Professor() --> \t"); print(new Professor()); // == Person p = new Professor();

	}

}
