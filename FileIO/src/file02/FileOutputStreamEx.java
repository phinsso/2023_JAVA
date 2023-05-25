package file02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		byte[] b = {7, 51, 3, 4, -1, 24};
		
		try {
			FileOutputStream fout = new FileOutputStream("c:\\Temp\\test.out");
			// 출력파일 객체변수 fout은 "test.out"을 가리킨다. (.out은 바이너리 파일)
			
			for(int i = 0; i < b.length; i++) {
				fout.write(b[i]); // 파일에 b[i]의 값을 이진수 값으로 출력
			}
			fout.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요.");
			return;
		}
		
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
		// test.out 파일을 메모장에서 불러오면 데이터가 깨진 것처럼 보인다

	}

}
