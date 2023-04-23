package pack06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String("C#");
		String b = new String(", C++");

		System.out.println(a + "길이는 " + a.length());
		System.out.println(a.contains("#"));

		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "JAVA");
		System.out.println(a);
		
		String[] s = a.split(","); // a 문자열을 분리하는 기준 => ,
		for(int i = 0; i <s.length; i++) {
			System.out.println("분리된 문자열 " + i + ": " + s[i]);
		}
		
		a = a.substring(5); // 인덱스 5 ~ 마지막 인덱스까지
		System.out.println(a);
		
		char c = a.charAt(0);
		System.out.println(c);
	}
}
