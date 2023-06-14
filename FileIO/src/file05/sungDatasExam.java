package file05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sungDatasExam {
	public void readingData(String fname) throws IOException {
		
		try {
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			String csvStr = "";
			String tmpStr = "";
			
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
					// tmpStr 있는 데이터를 csvStr에 저장하는데 한 줄의 끝마다 "\t"이 저장
				}
			} while (tmpStr != null);
			
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			// 토큰의 구분자가 탭 ("\t")
			
			int length = parse.countTokens() / 4; // 항목이 네 개이기 때문에 / 4를 함
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken(); // nextToken(): 다음 토큰을 불러옴
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] 
						+ "\t" + total[j] + "\t" + avg[j]);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}