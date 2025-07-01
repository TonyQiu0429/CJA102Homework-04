package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，
//但這次他想要依心情決定討厭哪個數字，
//請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
public class hw3_3_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);// 建立輸入物件
		System.out.println("請輸入不想選的數字： ");
		int a = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			int ten = i / 10, unit = i % 10;
			if (ten != a && unit != a) {
				count++;
				if (ten != a && unit != a) {
					System.out.print(i + " "); // 顯示可選數字
					if (count % 10 == 0) { // 每10個數字換行
						System.out.println();
					}
				}
			}
		}
		System.out.println("\n阿文可以選擇的總數為：" + count + " 個號碼");
	}
}