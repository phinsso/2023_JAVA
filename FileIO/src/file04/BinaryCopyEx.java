package file04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("./src/file03/forest.jpg");
		// src파일 객체를 생성하면 파일에 대한 정보를 얻을 수 있다.
		File dest = new File("./src/file04/copyforest.jpg");
		
		int c;
		
		try {
			FileInputStream fin = new FileInputStream(src);
			// fin 입력객체는 src 객체의 파일(forest.jpg)을 가리킨다.
			FileOutputStream fout = new FileOutputStream(dest);
			// fout 출력객체는 dest객체의 파일(copyforest.jpg)을 가리킨다.
			
			while((c = fin.read()) != -1) { // fin이 가리키는 파일에서 1바이트씩 읽어서
				fout.write((byte)c); // fout이 가리키는 파일(copyforest.jpg)에 출력한다.
			}
			
			fin.close();
			fout.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
		

	}

}
