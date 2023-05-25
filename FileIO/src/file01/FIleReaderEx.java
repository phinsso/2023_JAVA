package file01;

import java.io.FileReader;
import java.io.IOException;

public class FIleReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		// fin은 FileReader 클래스를 가리키는 객체변수로, 할당된 메모리는 없음
		// 파일에 관계되는 모든 프로그램은 try~catch문을 사용해야 함
		
		// try 문장 안에 있는 것을 실행하다가 오류가 발생하면 catch 문장으로 실행을 옮김
		// 만약 오류가 없다면 catch 문장은 실행 안 함
		try {
			fin = new FileReader("c:\\Windows\\system.ini");
			// fin 객체변수는 "system.ini" 파일을 가리킨다.
			int c;
			
			while((c = fin.read()) != -1) {
				// fin이 가리키는 파일에서 한 문자씩 읽어서 c에 저장하고,
				// fin이 파일의 끝에 도달하면 -1의 값을 넘겨준다. (-1은 파일의 끝을 의미)
				// 더 읽어올 텍스트가 없으면 false(-1)을 반환하고 while을 빠져나감.
				System.out.print((char)c);
			}
			fin.close(); // 파일을 닫아줌. -> fin 객체변수를 더 이상 사용하지 않겠다는 의미
			
		} catch(IOException e) { // 파일이 존재하지 않으면 실행
			System.out.println("입출력 오류");
		}
	}

}
