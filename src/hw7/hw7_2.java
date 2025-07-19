package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//• 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
//• 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//型簡化本題的程式設計)
//邏輯：1. 我目前有Dog、Cat檔案，將這兩個檔案輸入進來並輸出到C:\Object.ser裡。
//    2. 利用多型來讀取這些物件
public class hw7_2 {
	public static void main(String[] args) throws Exception {
		// 建立資料夾
		File folder = new File("C:\\data");
		if (!folder.exists())
			folder.mkdirs();
		// 建立檔案
		File myfile = new File(folder, "Object.ser");

		// 建立物件
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("多拉A夢");
		animals[1] = new Cat("小咪");
		animals[2] = new Dog("獅子丸");
		animals[3] = new Dog("哈太郎");

		// 輸出
		FileOutputStream fos = new FileOutputStream(myfile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}
		oos.close();
		fos.close();
		//

		// 輸入
		FileInputStream fis = new FileInputStream(myfile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(myfile.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) { // 無窮迴圈
				((Animal) ois.readObject()).speak();
				// 將obj轉型為Animal，注意括弧位置，要包在Animal中，不然還是用obj的類型
				System.out.println("--------------------");
			}
		} catch (EOFException e) { // 讀到結束
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		//
	}

}
