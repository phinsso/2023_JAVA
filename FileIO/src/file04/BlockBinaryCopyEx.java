package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BlockBinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("./src/file03/forest.jpg");
		File dest = new File("./src/file04/Copyforest2.jpg");
		
		try {
		FileInputStream fin = new FileInputStream(src);
		FileOutputStream fout = new FileOutputStream(dest);
		byte[] buf = new byte[1024*10]; // 1024는 1KB*10 => 10KB 용량 (버퍼)
		
		while(true) {
			int n = fin.read(buf); // fin이 가리키는 파일에서 데이터를 buf 크기 만큼 읽는다. n은 실제 읽은 바이트
			fout.write(buf, 0, n); // buf[0]부터 n만큼까지 fout이 가리키는 파일인 Copyforest2에 쓰기(출력)
			
			if(n < buf.length) break;
		}
		
		fin.close();
		fout.close();
		
		System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
