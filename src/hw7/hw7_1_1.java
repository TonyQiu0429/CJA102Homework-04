package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
public class hw7_1_1 {
	static void p(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) throws IOException {
		File myFile = new File("C:\\hw7\\sample.txt");
		long sampleByte = myFile.length();
		FileReader fis = new FileReader("C:\\hw7\\sample.txt");
		BufferedReader bis = new BufferedReader(fis);
		int countLine = 0;
		int countchar = 0;
		String line;
		while ((line = bis.readLine()) != null) {
			countLine++;
			countchar += line.length();
		}
		p("共有:" + sampleByte + "位元組");
		p("共有:" + countchar + "字元");
		p("共有:" + countLine + "列");
		bis.close();
		fis.close();
	}

}
