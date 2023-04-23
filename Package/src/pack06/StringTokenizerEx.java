package pack06;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/"); // "/"를 기준으로 문자열을 분리 (== split())
		
		while(st.hasMoreTokens()) // StringTokenizer에 다음 토큰이 있으면 true 리턴 (다음 토큰이 없으면 false를 리턴하고 while에서 나옴)
			System.out.println(st.nextToken());

	}

}