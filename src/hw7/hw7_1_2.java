package hw7;

import java.io.FileWriter;
import java.io.IOException;

//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)
//邏輯是：寫出一個亂數程式，將此檔案輸出到Data.txt中
public class hw7_1_2 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("C:\\hw7\\Data.txt", true);
		
		for(int i = 0; i < 10 ; i++) {
			int num = (int)(Math.random()*1000) +1;
			fw.write(num+" ");
		}
		fw.write("\n"); // 寫入換行
		fw.close();
		System.out.println("輸出完成");
		
	}
}
