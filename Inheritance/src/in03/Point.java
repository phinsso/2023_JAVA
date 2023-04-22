package in03;

public class Point {
	
	private int x, y; //한 점을 구성하는 x, y 좌표
	
	public Point() {
		this.x = this.y = 0;
	} //어차피 클래스 변수는 0이어서 굳이 필요하지 않음
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public void showPoint() { //점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}
