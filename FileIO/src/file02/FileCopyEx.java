package file02;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyEx {

	public static void main(String[] args) {
		FileReader fin = null;
		FileWriter fout = null;

		try {
			fin = new FileReader("c:\\Temp\\test.txt");
			fout = new FileWriter("c:\\Temp\\test.out");
			int c;

			while ((c = fin.read()) != -1) {
				// fin이 가리키는 파일에서 한 문자씩 읽어서 c에 저장하고,
				// fin이 파일의 끝에 도달하면 -1의 값을 넘겨준다. (-1은 파일의 끝을 의미)
				// 더 읽어올 텍스트가 없으면 false(-1)을 반환하고 while을 빠져나감.
				System.out.print((char) c);
				fout.write(c);
			}

			fin.close();
			fout.close();

		} catch (IOException e) { // 파일이 존재하지 않으면 실행
			System.out.println("입출력 오류");
		}

	}

}
