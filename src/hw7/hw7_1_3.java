package hw7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//代表的檔案會複製到第二個參數代表的檔案

//邏輯：寫出一個方法能夠將檔案複製。
public class hw7_1_3 {
	public static void copyFile(String src, String des) throws IOException {
		FileInputStream fr = new FileInputStream(src);
		FileOutputStream fw = new FileOutputStream(des);
		int length = 0;
		byte[] fileByte = new byte[1024];
		while ((length = fr.read(fileByte)) != -1) {
			// fileByte: 代表要輸出的byte陣列 (資料都放在裡面了)
			// 0: 代表從這個陣列的第一個元素開始輸出 (索引值)
			// length: 代表要輸出的資料量
			fw.write(fileByte, 0, length);
			fw.flush(); // 只有輸出端才有的操作，保險最後一趟有送完整
		}
		System.out.println("複製完成");
		fr.close();
		fw.close();
		
	}
}
