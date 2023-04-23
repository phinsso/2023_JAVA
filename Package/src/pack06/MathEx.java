package pack06;

public class MathEx {

	public static void main(String[] args) {
		System.out.println(Math.PI); // 파이
		System.out.println(Math.ceil(3.14)); // 올림 값 (소수점 상관 없이 정수 부분만 올려서 자름)
		System.out.println(Math.floor(3.14)); // 내림 값 (소수점 상관 없이 정수 부분만 내려서 자름)
		System.out.println(Math.sqrt(9)); // 루트(제곱근)
		System.out.println(Math.exp(2)); // E는 자연대수 (2.718282로 설정되어 있음)
		System.out.println(Math.round(3.14)); // 소수점 이하 첫째 자리에서 반올림
		
		// 1~45 사이의 난수(정수형) 발생
		System.out.print("이번 주 행운의 번호는: ");
		for(int i = 0; i < 5; i++) {
			System.out.print((int)(Math.random() * 45+ 1) + " ");
		}

	}

}
