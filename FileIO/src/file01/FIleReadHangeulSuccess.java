package file01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FIleReadHangeulSuccess {

	public static void main(String[] args) {
		FileInputStream fin = null;
		InputStreamReader in = null;
		
		try {
			fin = new FileInputStream("c:\\Windows\\system.ini");
			// 객체변수 fin은 "system.ini" 파일을 가리키는데, 그 데이터의 charset은 UTF-8로 설정
			in = new InputStreamReader(fin, "MS949");
			// fin이 가리키는 파일의 charset을 "MS949" 형식으로 변환시킨 파일을 가리키는 객체변수 in 생성
			int c;
			
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			
			while((c = in.read()) != -1) {
				System.out.println((char)c);
			}
			
			in.close(); // 객체 생성의 역순으로 파일을 가리키는 객체변수를 닫는다.
			fin.close();
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
