package coll03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		// 키보드로부터 데이터를 입력받기 위해서 객체 생성
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요: ");
			String s = sc.next();
			a.add(s);
		}
		
		for(int i = 0; i < 4; i++) {
			String name = a.get(i);
			System.out.print(name + " ");
		}
		
		// 각 요소에 저장되어 있는 데이터들의 길이 값을 가지고
		// 그 길이의 최댓값에 해당되는 인덱스를 구하는 알고리즘
		int longestIndex = 0;
		
		for(int i = 0; i < a.size(); i++) {
			if(a.get(longestIndex).length() < a.get(i).length()) {
				longestIndex = i;
			}
				
		}
		System.out.println("\n가장 긴 이름은: " + a.get(longestIndex));

	}

}
