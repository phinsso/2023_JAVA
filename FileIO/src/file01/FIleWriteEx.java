package file01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleWriteEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			
			while(true) {
				String line = sc.nextLine(); // 키보드로부터 줄 단위로 데이터를 입력
				
				if(line.length() == 0) break; // 콘솔창에서 데이터를 입력하지 않고 엔터키를 누를 경우
				// break 문장을 만나면 while문을 빠져나온다
				
				fout.write(line, 0, line.length());
				// fout이 가리키는 "test.txt" 파일에 0번쨰 데이터 ~ 입력된 데이터의 길이 만큼을 저장
				
				fout.write("\r\n", 0, 2);
				// fout이 가리키는 "test.txt" 파일에 줄을 바꾸고(개행) 커서를 맨 앞으로 가져온다.
			}
			fout.close();
			
		} catch(IOException e) {
			System.out.println("입출력 오류");
		}
		
		sc.close();

	}

}
