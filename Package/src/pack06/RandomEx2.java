package pack06;

// 주사위 눈의 수는 1 ~ 6 사이
// 주사위를 10번 던져서 전체 금액은 얼마인가?
// 1: 500, 2: 700, 3: 1200, 4: 1800, 5: 2100, 6: 3000
public class RandomEx2 {

	public static void main(String[] args) {
		
		int n = 0;
		int total = 0;
		
		for(int i = 0; i < 10; i++) {
			n = (int)(Math.random() * 6 + 1);
			
			if(n == 1)
				total += 500;
			else if(n == 2)
				total += 700;
			else if(n == 3)
				total += 1200;
			else if(n == 4)
				total += 1800;
			else if(n == 5)
				total += 2100;
			else
				total += 3000;
			
			System.out.println(n);
		}

		System.out.println(total);
	}

}
