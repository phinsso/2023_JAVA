package pack06;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		// sb = "This"
		
		sb.append(" is pencil"); // "This" + " is pencil"
		System.out.println(sb);
		
		sb.insert(7, " my"); // sb 문자열의 7번째 인덱스 자리에 추가됨 (원래 그 자리에 있던 문자열은 뒤로 이동함)
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // sb의 8번째 문자인 m 부터 10 - 1 번째 문자를 "your"으로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // 8번째에서 시작해서 13 - 1 번째까지 삭제
		System.out.println(sb);
		
		sb.setLength(4); // sb의 길이는 14인데, 길이를 4로 변경 -> 앞의 4개 문자열만 남기고 뒤는 모두 삭제됨
		System.out.println(sb);
	}

}
