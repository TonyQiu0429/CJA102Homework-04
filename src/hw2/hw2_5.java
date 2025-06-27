package hw2;

//阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
public class hw2_5 {
	public static void main(String[] args) {
		int ten = 0, unit = 0, count = 0;
		for (int i = 1; i <= 49; i++) {
			ten = i / 10;
			unit = i % 10;
			if (ten != 4 && unit != 4) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.print("\n阿文可以選擇的號碼總共有: " + count + " 個");
	}
}
